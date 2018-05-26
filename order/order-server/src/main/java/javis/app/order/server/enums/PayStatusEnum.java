package javis.app.order.server.enums;

import lombok.Getter;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午4:28
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
