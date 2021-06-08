package compositepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 14:47
 * @Version 1.0
 */
public abstract class Organization {
    public String name;
    public String desc;

    public Organization(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    public abstract void show();
}
