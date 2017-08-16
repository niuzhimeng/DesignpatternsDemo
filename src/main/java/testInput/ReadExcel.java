package testInput;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nzm on 2017/8/15.
 */

public class ReadExcel {
    /**
     * 读取excel
     *
     * @throws Exception
     */
    @Test
    public void read() throws Exception {

        List<String> resultList = new ArrayList<>();
        //当前单元格的元素
        String currentCell;

        String companyName = null;

        // 创建对Excel工作簿文件的引用
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("D:\\815test.xlsx")));

        // 创建对工作表的引用。
        XSSFSheet sheet = workbook.getSheetAt(0);
        // 便利所有单元格，读取单元格
        int row_num = sheet.getLastRowNum();
        XSSFRow row = sheet.getRow(0);
        int col_num = row.getLastCellNum();
        for (int i = 0; i <= row_num; i++) {
            XSSFRow cells = sheet.getRow(i);

            for (int j = 0; j < col_num; j++) {
                if (cells.getCell(j).getCellType() == 1) {
                    currentCell = cells.getCell(j).getStringCellValue();
                } else {
                    currentCell = NumberToTextConverter.toText(cells.getCell(j).getNumericCellValue());
                }

                if (j == 0) {
                    companyName = currentCell;
                }

                //第二列 内容
                if (j == 1) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(currentCell.getBytes(Charset.forName("utf8"))), Charset.forName("utf8")));
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (!line.trim().equals("")) {
                            line = line.replace("/", "-");
                            resultList.add(companyName + "#1#" + line);
                        }
                    }
                }
            }

        }
        write(resultList);
    }

    /**
     * 导出excel
     *
     * @param resultList 返回结果的list<入参,返回json>
     * @throws Exception
     */
    private void write(List<String> resultList) throws Exception {

        // 创建新的Excel 工作簿
        XSSFWorkbook workbook = new XSSFWorkbook();
        // 在Excel工作簿中建一工作表，其名为缺省值
        XSSFSheet sheet = workbook.createSheet();

        int col_num = 2;
        int row_num = resultList.size();
        for (int i = 0; i < row_num; i++) {
            XSSFRow row = sheet.createRow(i);
            String[] ss = resultList.get(i).split("#1#");
            for (int j = 0; j < col_num; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellType(XSSFCell.CELL_TYPE_STRING);
                cell.setCellValue(ss[j]);
            }
        }
        // 新建一输出文件流
        FileOutputStream fOut = new FileOutputStream(new File("D:\\write.xlsx"));
        // 把相应的Excel 工作簿存盘
        workbook.write(fOut);
        fOut.flush();
        // 操作结束，关闭文件
        fOut.close();

    }

}
