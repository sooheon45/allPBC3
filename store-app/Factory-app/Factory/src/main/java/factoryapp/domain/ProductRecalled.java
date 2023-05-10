package factoryapp.domain;

import factoryapp.domain.*;
import factoryapp.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductRecalled extends AbstractEvent {

    private Long id;
    private String lineNum;
    private Integer qty;
    private Integer name;
    private Long orderId;

    public ProductRecalled(Factory aggregate) {
        super(aggregate);
    }

    public ProductRecalled() {
        super();
    }
}
