package javis.app.product.server.utils;

import javis.app.product.server.vo.ResultVO;

public class ResultVOUtil {

    public static <T> ResultVO success(T object) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
