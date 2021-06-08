package adapterpattern.interfaceadapter;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 8:49
 * @Version 1.0
 * 接口适配器(与目标建立适配器使用时仅重写需要使用的方法)
 */
public class InterfaceAdapter {
    public static void main(String[] args) {
        new AdapterClass(){
            @Override
            public void init() {
                System.out.println("初始化项目");
            }
        }.init();

    }
}
