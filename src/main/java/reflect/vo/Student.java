package reflect.vo;

/**
 * Created by Nzm on 2017/12/22.
 */
public class Student {

    private Integer age;

    private void learn(){
        System.out.println("learn ing ...");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
