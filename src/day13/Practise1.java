package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author lt
 * @Description 缓冲字符流复制文件
 * @data 9/5 - 8:14
 */
public class Practise1 {
    public static void main(String[] args) {
        try {
            Practise1.copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void copyFile() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("F:\\DailyUse\\src\\day13\\tt3.txt"));

        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\DailyUse\\src\\day13\\tt4.txt"));

        char[] c = new char[100];
        int len = 0;

        while((len = br.read(c)) != -1){
            bw.write(c,0,len);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
