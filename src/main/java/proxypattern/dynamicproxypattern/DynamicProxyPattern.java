package proxypattern.dynamicproxypattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:35
 * @Version 1.0
 * 动态代理：目标对象需实现接口
 */
public class DynamicProxyPattern {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoFactory teacherFactory = new TeacherDaoFactory(teacherDao);
        ITeacherDao instance = (ITeacherDao) teacherFactory.getProxyInstance();
        instance.teach();
        System.out.println(instance.getClass());
    }
}
