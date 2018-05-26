package javis.app.product.server.service;


import javis.app.product.common.DecreaseStockInput;
import javis.app.product.server.dataobject.ProductInfo;

import java.util.List;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:29
 */
public interface ProductService {

    List<ProductInfo> findUpAll();

    List<ProductInfo> findList(List<String> productIdList);

    void decreaseStock(List<DecreaseStockInput> cartDTOList);
}
