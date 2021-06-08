package compositepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 15:09
 * @Version 1.0
 * @Desc: 组合模式
 */
public class CompositePattern {
    public static void main(String[] args) {
        Organization university = new University("清华大学", "好大学👌");
        Organization college = new College("计算机与信息科学学院","好学院👌");
        Organization college2 = new College("物理学院","好学院👌");
        Organization profession = new Profession("软件工程","好专业👌");
        Organization profession2 = new Profession("天文物理","好专业👌");
        college.add(profession);
        college2.add(profession2);
        university.add(college);
        university.add(college2);
        university.show();
    }
}
