package javis.app.order.server.exception;


import javis.app.order.server.enums.ResultEnum;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午5:14
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
