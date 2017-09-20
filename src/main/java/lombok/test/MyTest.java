package lombok.test;

import lombok.vo.Student;
import org.junit.Test;

/**
 * Created by Nzm on 2017/9/6.
 */
public class MyTest {

    @Test
    public void test1() {
        Student student = Student.builder().build();
        student.name("nzm1");
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        int j = 1;
        Integer[] integers = new Integer[6];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = j;
            j += 2;
        }
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
