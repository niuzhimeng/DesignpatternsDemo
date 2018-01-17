package reflect;

import org.junit.Test;
import reflect.vo.Student;

import java.lang.reflect.Method;

/**
 * Created by Nzm on 2017/12/22.
 */
public class ReflectTest {

    @Test
    public void test() throws Exception {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();

        Method learn = studentClass.getDeclaredMethod("learn");
        learn.setAccessible(true);
        learn.invoke(null);

    }
}
