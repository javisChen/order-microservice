package javis.app.order.server.repository;

import javis.app.order.server.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午3:06
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
