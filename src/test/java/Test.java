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
    public void test4() {
        String name = "牛智萌";
        String phone = "15776701949";
        String idCard = "230206199408270913";
        phone = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        idCard = idCard.replaceAll("(\\d{4})\\d{10}(\\w{4})", "$1*****$2");
        name = name.replaceAll("([\\u4e00-\\u9fa5]{1})(.*)", "$1" + createAsterisk(name.length()));

        System.out.println(phone + "||||" + idCard);
        System.out.println(name);
    }

    private String createAsterisk(int length) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < length - 1; i++) {
            stringBuffer.append("*");
        }
        return stringBuffer.toString();
    }
}
