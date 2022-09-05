package day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lt
 * @Description
 * @data 9/1 - 9:41
 */

public class Practise {
    public static void main(String[] args) {
        try {
            Practise.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 用缓冲流实现文件的复制
     */
    public static void copyFile() throws Exception {
        //缓冲输入流
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("F:\\DailyUse\\src\\day13\\tt1.txt"));
        //缓冲输出流
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("F:\\DailyUse\\src\\day13\\tt2.txt"));

        byte[] b = new byte[1024];
        int len = 0;
        while((len = br.read(b)) != -1){
            bo.write(b,0,len);//写到内存
        }
        bo.flush();
        bo.close();
        br.close();
    }
}
