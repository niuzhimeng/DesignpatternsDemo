package lombok.test;

import lombok.vo.Student;
import org.junit.Test;

/**
 * Created by Nzm on 2017/9/6.
 */
public class MyTest {

    @Test
    public void test1() {
        Student student = Student.builder().age(23).build();
        System.out.println(student.toString());
    }
}
