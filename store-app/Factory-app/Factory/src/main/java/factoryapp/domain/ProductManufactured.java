package factoryapp.domain;

import factoryapp.domain.*;
import factoryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductManufactured extends AbstractEvent {

    private Long id;
    private String lineNum;
    private Integer qty;
    private Integer name;
    private Long orderId;

    public ProductManufactured(Factory aggregate) {
        super(aggregate);
    }

    public ProductManufactured() {
        super();
    }
}
