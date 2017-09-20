import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.util.*;
import java.util.stream.Collectors;
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

    @org.junit.Test
    public void test5() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");

        list.remove("3");
        list.remove("2");
        list.forEach(l -> {
            System.out.println(l);
        });
    }

    @org.junit.Test
    public void test6() {
        List<String> list = Arrays.asList("1", "1", "2", "2");
        list = list.stream().distinct().collect(Collectors.toList());
        list.forEach(s -> System.out.println(s));
    }

    @org.junit.Test
    public void test7() {
        LocalDateTime today = LocalDateTime.now();

        LocalDate dateOfBirth = LocalDate.of(2010, 9, 12);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);
        if (currentMonthDay.equals(birthday)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }
    }

    @org.junit.Test
    public void test8() {
        Stream<List<Integer>> inputStream = Stream.of(
                Collections.singletonList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.flatMap(Collection::stream);
        outputStream.forEach(System.out::println);
    }

}
