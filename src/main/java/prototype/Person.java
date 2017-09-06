package prototype;

import java.io.*;

/**
 * 原型类
 * Created by Nzm on 2017/8/25.
 */
public class Person implements Cloneable,Serializable {

    private static final long serialVersionUID = 7678416649060861010L;

    private String name;

    private String age;

    private Father father;

    public Person clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    public Person deepClone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        bao.close();
        oos.close();
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Person person = (Person) ois.readObject();
        bis.close();
        ois.close();
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }
}
