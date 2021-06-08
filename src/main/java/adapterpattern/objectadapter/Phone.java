package adapterpattern.objectadapter;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 8:07
 * @Version 1.0
 */
public class Phone  {
    public void charge(ElectricAdapter electricAdapter){
        System.out.println("充电中：电压："+electricAdapter.change());
    }
}
