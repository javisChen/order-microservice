package javis.app.order.server.repository;


import javis.app.order.server.OrderApplicationTests;
import javis.app.order.server.dataobject.OrderMaster;
import javis.app.order.server.enums.OrderStatusEnum;
import javis.app.order.server.enums.PayStatusEnum;
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
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("javis");
        orderMaster.setBuyerPhone("18588686716");
        orderMaster.setBuyerAddress("越秀区");
        orderMaster.setBuyerOpenid("12312312");
        orderMaster.setOrderAmount(new BigDecimal("2"));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster master = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(master);
    }
}