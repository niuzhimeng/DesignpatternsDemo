package prototype;

import java.io.Serializable;

/**
 * Created by Nzm on 2017/8/25.
 */
public class Father implements Serializable {

    private String name;

    private String age;

    public Father(String name) {
        this.name = name;
    }

    public Father(String name, String age) {
        this.name = name;
        this.age = age;
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
}
