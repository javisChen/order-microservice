package javis.app.product.server.service;


import javis.app.product.server.dataobject.ProductCategory;

import java.util.List;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:29
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
