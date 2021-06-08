package test;

import java.util.ArrayList;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 8:29
 * @Version 1.0
 */
public class ExtendTest {
    public static void main(String[] args) {
        C c = new C();
        C c2 = new C();
        c.setAge(12);
        System.out.println(c.getAge());
        int a = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        System.out.println(c.hashCode());
        System.out.println(c2.hashCode());
    }
}
class A{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class B extends A{
    @Override
    public int getAge() {
        return super.getAge();
    }
}
class C extends B{
    @Override
    public int getAge() {
        return super.getAge();
    }
}