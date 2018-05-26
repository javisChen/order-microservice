package javis.app.product.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午10:47
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product msg 2";
    }

}
