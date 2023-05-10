package storeapp.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import storeapp.FactoryApplication;
import storeapp.domain.ProductManufactured;
import storeapp.domain.StockIncreased;

@Entity
@Table(name = "Storage_table")
@Data
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer stock;

    @PostPersist
    public void onPostPersist() {
        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();

        ProductManufactured productManufactured = new ProductManufactured(this);
        productManufactured.publishAfterCommit();
    }

    public static StorageRepository repository() {
        StorageRepository storageRepository = FactoryApplication.applicationContext.getBean(
            StorageRepository.class
        );
        return storageRepository;
    }

    public void decreaseStock(DecreaseStockCommand decreaseStockCommand) {
        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();
    }
}
