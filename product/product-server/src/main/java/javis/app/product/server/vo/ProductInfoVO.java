package javis.app.product.server.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:47
 */
@NoArgsConstructor
@Data
public class ProductInfoVO {


    /**
     * id : 123456
     * name : 皮蛋粥
     * price : 1.2
     * description : 好吃的皮蛋粥
     * icon : http://xxx.com
     */

    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}
