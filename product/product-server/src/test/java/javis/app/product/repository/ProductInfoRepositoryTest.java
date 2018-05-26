package javis.app.product.repository;


import javis.app.product.ProductApplicationTests;
import javis.app.product.server.dataobject.ProductInfo;
import javis.app.product.server.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:16
 */
public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productStatus = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(productStatus.size() > 0);
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> products = productInfoRepository.findByProductIdIn(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(products.size() > 0);
    }
}