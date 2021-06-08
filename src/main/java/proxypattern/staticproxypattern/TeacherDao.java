package proxypattern.staticproxypattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:06
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师教书。。。。。");
    }
}
