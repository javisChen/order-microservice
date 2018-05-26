package javis.app.order.server.enums;

import lombok.Getter;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午5:15
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空"),;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
