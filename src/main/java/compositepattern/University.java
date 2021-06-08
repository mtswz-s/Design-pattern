package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 14:49
 * @Version 1.0
 */
public class University extends Organization {
    private List<Organization> colleges = new ArrayList<>();
    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        colleges.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        colleges.remove(organization);
    }

    @Override
    public void show() {
        System.out.println("-------------"+getName()+"--------------");
        for (Organization o : colleges){
            o.show();
        }
    }
}
