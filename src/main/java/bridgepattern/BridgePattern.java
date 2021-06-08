package bridgepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 15:10
 * @Version 1.0
 * 桥接模式
 */
public class BridgePattern {
    public static void main(String[] args) {
        FoldablePhone vivo = new FoldablePhone(new Vivo());
        vivo.open();
        vivo.call();
        vivo.close();
        System.out.println("-----------------------------------------");
        ClamshellPhone xiaomi = new ClamshellPhone(new Xiaomi());
        xiaomi.open();
        xiaomi.call();
        xiaomi.close();
    }
}
