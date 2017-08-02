import java.util.*;
import java.util.stream.Stream;

/**
 * Created by txsk on 2017/7/24.
 */
public class Test {

    @org.junit.Test
    public void test2() {
        Calendar expireTime = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        expireTime.add(Calendar.HOUR, 24);

        boolean before = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).before(expireTime);
        System.out.println(before);
    }

    @org.junit.Test
    public void test3() {
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1, 2),
                Arrays.asList(2, 3),
                Arrays.asList(3, 4)
        );
        inputStream.flatMap(Collection::stream).distinct().forEach(System.out::println);

    }

    @org.junit.Test
    public void test4(){
        String str = "1,2,3,";
        String[]ss = str.split(",");

    }
}
