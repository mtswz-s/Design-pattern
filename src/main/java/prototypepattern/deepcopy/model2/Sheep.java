package prototypepattern.deepcopy.model2;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 8:16
 * @Version 1.0
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private int age;
    private Dog friend;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog getFriend() {
        return friend;
    }

    public void setFriend(Dog friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object deepCopy(){
        Object sheep =null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Object o = ois.readObject();
            sheep =  o;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //TODO 关闭流

            return sheep;
        }
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object sheep = this.deepCopy();
        return sheep;
    }
}
