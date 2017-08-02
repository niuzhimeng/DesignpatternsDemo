package pio.test;

import pio.impl.PoliceIdentity;

import java.io.File;

/**
 * Created by Nzm on 2017/8/2.
 */
public class Test {

    @org.junit.Test
    public void test() throws Exception {

        File file = new File("D:\\test.xlsx");
        PoliceIdentity police = new PoliceIdentity();
        police.appendAccountInfo("nzm", "123");
        police.read(file);
    }
}
