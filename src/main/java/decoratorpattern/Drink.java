package decoratorpattern;

import java.math.BigDecimal;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 8:56
 * @Version 1.0
 * 该类封装了咖啡类以及配料类的公共属性
 */
public abstract class Drink {
   public  String desc;
    public BigDecimal price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Drink(){};
}
