package factorypattern.method;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 14:54
 * @Version 1.0
 * 工厂方法模式
 */
public class Method {
    public static void main(String[] args) {
        Car BYD = new BYDFactory().creatCar();
        BYD.run();
    }
}
