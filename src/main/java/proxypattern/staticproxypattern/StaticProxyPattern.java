package proxypattern.staticproxypattern;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:09
 * @Version 1.0
 * 静态代理
 */
public class StaticProxyPattern {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
