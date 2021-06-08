package flyweightpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 9:17
 * @Version 1.0
 */
public class DefaultWebSite extends WebSite {
    private String name;

    public DefaultWebSite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void show(User user) {
        System.out.println("展示网站:"+getName()+"---使用者:"+user.getName());
    }
}
