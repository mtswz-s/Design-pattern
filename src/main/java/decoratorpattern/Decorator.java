package decoratorpattern;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 9:07
 * @Version 1.0
 * 配料类：
 * 继承Drink可获取公共属性
 * 聚合Drink便于对价格进行计算
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(drink.getPrice(), MathContext.DECIMAL32);
    }

    @Override
    public String getDesc() {
        return drink.getDesc()+super.getDesc();
    }
}
