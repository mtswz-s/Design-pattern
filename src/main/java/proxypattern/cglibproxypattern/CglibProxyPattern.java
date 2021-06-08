package proxypattern.cglibproxypattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 17:55
 * @Version 1.0
 * cglib代理:目标对象不需要实现接口
 */
public class CglibProxyPattern {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoFactory teacherDaoFactory = new TeacherDaoFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) teacherDaoFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
