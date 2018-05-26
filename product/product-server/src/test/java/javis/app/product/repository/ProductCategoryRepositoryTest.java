package javis.app.product.repository;

import javis.app.product.ProductApplicationTests;
import javis.app.product.server.dataobject.ProductCategory;
import javis.app.product.server.repository.ProductCategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:24
 */
public class ProductCategoryRepositoryTest extends ProductApplicationTests {


    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 12));
        Assert.assertTrue(list.size() > 0);
    }
}