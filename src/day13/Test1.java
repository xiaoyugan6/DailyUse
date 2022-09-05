package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


/**
 * @author lt
 * @Description 缓冲字符流BufferedReader、BufferedWriter
 * @data 9/1 - 10:11
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            Test1.testBufferedReader();
            Test1.testBufferWriter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 缓冲字符输入流
     */
    public static void testBufferedReader() throws Exception {
        FileReader r = new FileReader("F:\\DailyUse\\src\\day13\\tt.txt");

        BufferedReader br = new BufferedReader(r);

        char[] c = new char[100];

        int len = 0;

        while((len = br.read(c)) != -1){
            System.out.println(new String(c,0,len));
        }
        br.close();
        r.close();

    }

    /**
     * 缓冲字符输出流
     */
    public static void testBufferWriter() throws Exception {
        FileWriter fw = new FileWriter("F:\\DailyUse\\src\\day13\\tt3.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        String s = "jinitaimei";
        bw.write(s);
        bw.flush();
        bw.close();
        fw.close();
    }
}