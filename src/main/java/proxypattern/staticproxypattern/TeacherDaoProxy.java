package proxypattern.staticproxypattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:07
 * @Version 1.0
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("教书前");
        teacherDao.teach();
        System.out.println("教书后");
    }
}
