package javis.app.order.server.service;

import javis.app.order.server.dto.OrderDTO;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午4:46
 */
public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);
}
