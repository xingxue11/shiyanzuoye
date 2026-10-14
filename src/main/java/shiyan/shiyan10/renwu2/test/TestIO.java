package shiyan.shiyan10.renwu2.test;

import shiyan.shiyan10.renwu2.service.EncryptInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestIO {
    public static void main(String[] args) throws IOException {
        // 路径改成你桌面data.txt的路径
        FileInputStream fis = new FileInputStream("C:\\Users\\10779\\Desktop\\data.txt");
        EncryptInputStream eis = new EncryptInputStream(fis);

        int ch;
        while ((ch = eis.read()) != -1){
            System.out.print((char) ch);
        }
        eis.close();
        fis.close();
    }
}
