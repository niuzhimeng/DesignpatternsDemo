package pio;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 批量测试抽象类
 * Created by Nzm on 2017/8/2.
 */
public abstract class PoiTest {
    /**
     * 读取excel
     *
     * @param file 文件对象
     * @throws Exception
     */
    public void read(File file) throws Exception {
        //返回结果集合
        List<String> resultList = new ArrayList<>();
        //一行元素的集合
        List<String> rowList = new ArrayList<>();
        //当前单元格的元素
        String currentCell;

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
                rowList.add(currentCell);
            }
            String url = appendUrl(rowList);
            //发送http请求
//            String resultString = OkHttpUtils.get(url);
            String resultString = "{假装有json}";
            StringBuilder parameterString = new StringBuilder();
            for (String parameter : rowList) {
                parameterString.append(parameter).append("; ");
            }

            resultList.add(parameterString.toString() + "," + resultString);
            Thread.sleep(30);
            System.out.println(url);
            rowList.clear();
        }
        //调用输出方法
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

        int col_num = resultList.get(0).split(",")[0].split("; ").length;
        int row_num = resultList.size();
        for (int i = 0; i < row_num; i++) {
            XSSFRow row = sheet.createRow(i);
            String[] ss = resultList.get(i).split(",");
            String[] params = ss[0].split("; ");
            for (int j = 0; j < col_num; j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                cell.setCellValue(params[j]);
            }
            XSSFCell cell = row.createCell(col_num + 1);
            cell.setCellType(HSSFCell.CELL_TYPE_STRING);
            cell.setCellValue(ss[1]);
        }
        // 新建一输出文件流
        FileOutputStream fOut = new FileOutputStream(new File("D:\\write.xlsx"));
        // 把相应的Excel 工作簿存盘
        workbook.write(fOut);
        fOut.flush();
        // 操作结束，关闭文件
        fOut.close();

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
    protected String appendAccountInfo(String url, String account, String token) {
        return url += "?account=" + account + "&accessToken=" + token;
    }
}

