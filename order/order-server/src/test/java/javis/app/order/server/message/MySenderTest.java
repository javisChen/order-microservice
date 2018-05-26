package javis.app.order.server.message;

import javis.app.order.server.OrderApplicationTests;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-26
 * @time 下午4:05
 */
public class MySenderTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue", "now" + new Date());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend("myOrder", "computer", " computer now" + new Date());
    }

    @Test
    public void sendFruitOrder() {
        amqpTemplate.convertAndSend("myOrder", "fruit", "fruit now" + new Date());
    }
}
