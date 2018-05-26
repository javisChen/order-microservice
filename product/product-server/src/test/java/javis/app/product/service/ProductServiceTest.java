package javis.app.product.service;

import javis.app.product.ProductApplicationTests;
import javis.app.product.common.DecreaseStockInput;
import javis.app.product.server.dataobject.ProductInfo;
import javis.app.product.server.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 上午11:37
 */
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfo> list = productService.findList(Arrays.asList("157875196366160022", "157875227953464068"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("157875196366160022", 2);
        List<DecreaseStockInput> cartDTOS = new ArrayList<>();
        cartDTOS.add(decreaseStockInput);
        productService.decreaseStock(cartDTOS);
    }
}