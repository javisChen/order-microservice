package javis.app.product.server.exception;

import javis.app.product.server.enums.ResultEnum;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-08
 * @time 上午10:44
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

}
