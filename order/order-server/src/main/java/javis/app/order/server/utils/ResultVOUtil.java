package javis.app.order.server.utils;

import javis.app.order.server.vo.ResultVO;

public class ResultVOUtil {

    public static <T> ResultVO success(T object) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
