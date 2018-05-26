package javis.app.product.server.enums;

import lombok.Getter;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午5:15
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存不足"),;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
