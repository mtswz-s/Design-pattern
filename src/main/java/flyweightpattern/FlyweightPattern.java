package flyweightpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 9:25
 * @Version 1.0
 * 享元模式
 */
public class FlyweightPattern {
    public static void main(String[] args) {
        WebSite webSite1 = WebSiteFactory.getWebSite("博客");
        webSite1.show(new User("小明"));
        WebSite webSite2 = WebSiteFactory.getWebSite("博客");
        webSite2.show(new User("小红"));
        WebSite webSite = WebSiteFactory.getWebSite("新闻");
        webSite.show(new User("小飞"));
        WebSiteFactory.getSize();
    }
}
