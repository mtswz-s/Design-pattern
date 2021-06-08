package bridgepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 14:50
 * @Version 1.0
 */
public abstract class Phone {
    public Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
     void open(){
        brand.open();
     };

     void call(){
         brand.call();
     };

     void close(){
         brand.close();
     };
}
