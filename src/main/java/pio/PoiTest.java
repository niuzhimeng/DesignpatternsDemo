package pio;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pio.utils.OkHttpUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nzm on 2017/8/2.
 */
public abstract class PoiTest {

    public void read(File file) throws Exception {

        //一行元素的集合
        List<String> cellList = new ArrayList<>();
        //当前单元格的元素
        String currentCell;

        StringBuilder rowCell = new StringBuilder();
        // 创建对Excel工作簿文件的引用
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));

        // 创建对工作表的引用。
        XSSFSheet sheet = workbook.getSheetAt(0);
        // 便利所有单元格，读取单元格
        int row_num = sheet.getLastRowNum();
        XSSFRow row = sheet.getRow(0);
        int col_num = row.getLastCellNum();
        for (int i = 1; i <= row_num; i++) {
            XSSFRow cells = sheet.getRow(i);

            for (int j = 0; j < col_num; j++) {
                if (cells.getCell(j).getCellType() == 1) {
                    currentCell = cells.getCell(j).getStringCellValue();
                } else {
                    currentCell = NumberToTextConverter.toText(cells.getCell(j).getNumericCellValue());
                }
                cellList.add(currentCell);
            }
            String url = appendUrl(cellList);
            OkHttpUtils.get(url);
        }

    }

    /**
     * 钩子方法
     *
     * @param cell 单元格中的元素
     * @return 拼接好的url
     */
    public abstract String appendUrl(List<String> cell);

    /**
     * 拼接账号信息
     *
     * @param account 账号
     * @param token   token
     */
    public abstract void appendAccountInfo(String account, String token);
}

