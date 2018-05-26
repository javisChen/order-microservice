package javis.app.order.server.repository;


import javis.app.order.server.OrderApplicationTests;
import javis.app.order.server.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午3:10
 */
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave() {
        OrderDetail detail = new OrderDetail();
        detail.setDetailId("123123");
        detail.setOrderId("12312312");
        detail.setProductId("157875196366160022");
        detail.setProductName("皮蛋粥");
        detail.setProductPrice(new BigDecimal("0.01"));
        detail.setProductQuantity(2);
        detail.setProductIcon("//fuss10.elemecdn.com/0/49/65d10ef215d3c770ebb2b5ea962a7jpeg.jpeg");

        OrderDetail detail1 = orderDetailRepository.save(detail);
        Assert.assertNotNull(detail1);
    }
}