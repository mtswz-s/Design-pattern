package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 14:57
 * @Version 1.0
 */
public class College extends Organization {
    private List<Organization> professions = new ArrayList<>();
    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(Organization organization) {
        professions.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        professions.remove(organization);
    }

    @Override
    public void show() {
        System.out.println("-------------"+getName()+"------------");
        for (Organization o :professions){
            o.show();
        }
    }
}
