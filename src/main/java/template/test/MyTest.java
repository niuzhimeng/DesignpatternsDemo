package template.test;

import template.impl.Coffee;
import template.impl.Tea;

import java.io.IOException;

/**
 * Created by Nzm on 2017/9/15.
 */
public class MyTest {


    public static void main(String[] args) throws IOException {
        Coffee coffee = new Coffee();
        coffee.make();
        System.out.println("---------------------");
        Tea tea = new Tea();
        tea.make();
    }


}
