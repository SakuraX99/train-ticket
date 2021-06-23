package travel.entity.consign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @author fdse
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consign {
    @Id
    private Integer id;
    private String orderId;
    private String accountId;
    private String handleDate;
    private String targetDate;
    private String from;
    private String to;
    private String consignee;
    private String phone;
    private double weight;
    private boolean isWithin;


}