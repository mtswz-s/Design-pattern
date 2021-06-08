package decoratorpattern;

import java.math.BigDecimal;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 9:01
 * @Version 1.0
 */
public class Starbucks extends Coffee {
    public Starbucks() {
        super();
        setDesc("星巴克咖啡");
        setPrice(new BigDecimal(20.0));
    }

}
