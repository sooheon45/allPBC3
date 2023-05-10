package springsaga.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class IncreaseStockCommand {

    @Id
    private Long id;
}
