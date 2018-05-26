package javis.app.order.server.utils;

import java.util.Random;

/**
 * @author JarvisChen
 * @desc
 * @date 2018-05-07
 * @time 下午5:01
 */
public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
