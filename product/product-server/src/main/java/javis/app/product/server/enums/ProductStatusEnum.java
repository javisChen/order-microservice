package javis.app.product.server.enums;

import lombok.Getter;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:30
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
