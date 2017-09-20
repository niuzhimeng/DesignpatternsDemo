package template.impl;

import template.CaffeineBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nzm on 2017/9/15.
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void steep() {
        System.out.println("泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    protected Boolean ifAdd() throws IOException {
        Boolean answer = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().startsWith("n")) {
            answer = false;
        }
        return answer;
    }
}
