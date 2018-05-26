package javis.app.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-26
 * @time 下午4:03
 */
@Slf4j
@Component
public class MqReceiver {

    // 自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
    // 自动创建队列，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue"), exchange = @Exchange("myExchange")))
    public void process(String message) {
        log.info("MqReceiver: {}", message);
    }

    // 数码供应商 接收消息
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            key = "computer",
            exchange = @Exchange("myOrder")))
    public void processComputerOrder(String message) {
        log.info("computer: {}", message);
    }

    // 水果供应商 接收消息
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),
            key = "fruit",
            exchange = @Exchange("myOrder")))
    public void processFruitOrder(String message) {
        log.info("fruit: {}", message);
    }
}
