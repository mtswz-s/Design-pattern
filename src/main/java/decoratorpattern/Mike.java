package decoratorpattern;

import java.math.BigDecimal;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 9:10
 * @Version 1.0
 */
public class Mike extends Decorator {
    public Mike(Drink drink) {
        super(drink);
        setDesc("加入牛奶");
        setPrice(new BigDecimal(5.3));
    }
}
