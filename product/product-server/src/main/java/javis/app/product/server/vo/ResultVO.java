package javis.app.product.server.vo;

import lombok.Data;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:44
 */
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;
}
