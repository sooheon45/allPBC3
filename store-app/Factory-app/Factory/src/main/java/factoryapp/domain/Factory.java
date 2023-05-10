package factoryapp.domain;

import factoryapp.FactoryApplication;
import factoryapp.domain.ProductManufactured;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Factory_table")
@Data
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lineNum;

    private Integer qty;

    private Integer name;

    @PostPersist
    public void onPostPersist() {
        ProductManufactured productManufactured = new ProductManufactured(this);
        productManufactured.publishAfterCommit();
    }

    public static FactoryRepository repository() {
        FactoryRepository factoryRepository = FactoryApplication.applicationContext.getBean(
            FactoryRepository.class
        );
        return factoryRepository;
    }

    public void recallProduct(RecallProductCommand recallProductCommand) {
        ProductRecalled productRecalled = new ProductRecalled(this);
        productRecalled.publishAfterCommit();
    }
}
