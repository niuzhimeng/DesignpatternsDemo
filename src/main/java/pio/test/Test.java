package pio.test;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pio.impl.PoliceIdentity;
import pio.impl.Traffic;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

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

    @org.junit.Test
    public void test2() throws Exception {
        File file = new File("D:\\traffic.xlsx");
        Traffic traffic = new Traffic();
        traffic.appendAccountInfo("nzm2", "456");
        traffic.read(file);
    }


}
