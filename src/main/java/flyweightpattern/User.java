package flyweightpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 9:14
 * @Version 1.0
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
