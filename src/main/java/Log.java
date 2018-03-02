import java.io.*;

/**
 * Created by Nzm on 2017/11/23.
 */
public class Log {

    public static void main(String[] args) {
        String key = "4element";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferWriter = null;

        File file = new File("D:\\test.log");
        File file1 = new File("D:\\" + key + ".log");
        if (!file1.getParentFile().exists()) {
            file1.getParentFile().mkdirs();
        }
        try {
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter(file1, true);

            bufferedReader = new BufferedReader(reader);
            bufferWriter = new BufferedWriter(writer);

            String str;
            int i = 0;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.contains(key)) {
                    bufferWriter.write(str + "\r\n");
                }
                i++;
                if (i % 200 == 0) {
                    bufferWriter.flush();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferWriter != null) {
                    bufferWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
