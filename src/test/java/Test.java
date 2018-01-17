import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static javax.swing.text.html.HTML.Tag.OL;

/**
 * Created by txsk on 2017/7/24.
 */
public class Test {
    private final Logger LOGGER = Logger.getLogger(Test.class);

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
        list.forEach(System.out::println);
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

    @org.junit.Test
    public void test10() {
        int[] a = {8, 9, 3, 6, 4, 7, 6, 1};
        sort(a, 0, a.length - 1);

        for (int anA : a) {
            System.out.print(anA + " ");
        }
    }

    private void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];

        while (end > start) {
            //从后往前比较
            while (end > start && a[end] >= key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] < key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while (end > start && a[start] <= key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] > key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if (start > low) sort(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) sort(a, end + 1, high);//右边序列。从关键值索引+1到最后一个
    }


    @org.junit.Test
    public void test11() {
        for (int i = 0; i < 1; i++) {
            System.out.println(UUID.randomUUID().toString().replace("-", ""));
        }
    }

    @org.junit.Test
    public void test12() {
        String str = "123.1234";
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,4})?$"); // 判断小数点后2位的数字的正则表达式
        Matcher match = pattern.matcher(str);
        System.out.println(match.matches());
    }

    @org.junit.Test
    public void test() {
        String str = "2017-01-04 今日邮寄专票";
        String pattern = "\\d{4}(\\-|\\/|.)\\d{1,2}\\1\\d{1,2}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }

    @org.junit.Test
    public void test13() throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long("1505354846000");
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        System.out.println(res);
    }

    @org.junit.Test
    public void test14() {

        LocalDate parse = LocalDate.parse("2017-11-02");
        Period between = Period.between(parse, LocalDate.now());
        System.out.println(between.getMonths());

    }

    @org.junit.Test
    public void test15() {
        LocalDate now = LocalDate.now();
        LocalDate with = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(with);
    }

    @org.junit.Test
    public void test16() {
        Map<String, Integer> map = new HashMap<>();
        map.put("d", 2);
        map.put("c", 4);
        map.put("b", 1);
        map.put("a", 3);

        List<Map.Entry<String, Integer>> infoList = new ArrayList<>(map.entrySet());

        infoList.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

        infoList.forEach(System.out::println);
    }

    @org.junit.Test
    public void test17() {
        LocalDate end = LocalDate.parse("2017-12-12");
        end = end.plusDays(1);
        System.out.println(end.toString());
    }

    @org.junit.Test
    public void test18() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        Collections.shuffle(list); // 打乱List集合中的元素
        System.out.println(list);
    }

    @org.junit.Test
    public void test19() {
        int a = 1;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "," + b);
    }

    @org.junit.Test
    public void test20() {
        LocalDate firstDayOfMonth = LocalDate.now()
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("这个月的第一天: " + firstDayOfMonth);
        LocalDate with = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("这个月的第一天: " + with);
    }

    @org.junit.Test
    public void test21() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("1", 2);
        map.forEach((k, v) -> {
            System.out.println(k);
        });

    }

    @org.junit.Test
    public void test22() {
        String content = "111   1";
        Pattern p = Pattern.compile("[0-9a-zA-Z]{4,20}");

        Matcher matcher = p.matcher(content);
        System.out.println(matcher.matches());
    }
}
