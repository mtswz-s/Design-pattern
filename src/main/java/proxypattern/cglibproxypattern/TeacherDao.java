package proxypattern.cglibproxypattern;

import proxypattern.dynamicproxypattern.ITeacherDao;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:05
 * @Version 1.0
 */
public class TeacherDao {
    public void teach() {
        System.out.println("老师教书。。。。。");
    }
    public void rest(Integer time) {
    }
}
