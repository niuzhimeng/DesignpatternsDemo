package pio;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Nzm on 2017/8/2.
 */
public class PoiTest {
    @Test
    public void read() {
        StringBuilder result = new StringBuilder();
        // 创建对Excel工作簿文件的引用
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(new FileInputStream(new File("D:\\test.xlsx")));

            // 创建对工作表的引用。
            XSSFSheet sheet = workbook.getSheetAt(0);
            // 便利所有单元格，读取单元格
            int row_num = sheet.getLastRowNum();
            XSSFRow row = sheet.getRow(0);
            int col_num = row.getLastCellNum();
            for (int i = 1; i <= row_num; i++) {
                XSSFRow r = sheet.getRow(i);
                for (int j = 0; j < col_num; j++) {
                    result.append(r.getCell(j).getStringCellValue());
                    result.append("\t\t");
                }
                result.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件没找到 : " + e);
        } catch (IOException e) {
            System.out.println("已运行IO异常: " + e);
        }
        System.out.println(result.toString());
    }
}

