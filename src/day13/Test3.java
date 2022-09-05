package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * @author lt
 * @Description 标准输入和输出流
 * @data 9/5 - 10:30
 */
public class Test3 {
    public static void main(String[] args) {
        try {
//            Test3.testSystemIn();
            Test3.writeToTxt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 标准输入流
     * @throws Exception
     */
    public static void testSystemIn() throws Exception{
        //创建一个接收键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);

        //把输入流放到缓冲流里
        BufferedReader br = new BufferedReader(is);

        String str = "";//定义一个临时接收数据的字符串

        while((str = br.readLine()) != null){//readLine方法返回一个字符串，如果是null表示读完
            System.out.println(str);
        }

        br.close();
        is.close();
    }


    //练习：把控制台输入的内容写入到指定的TXT文件中，当接收到字符串over，就结束程序的运行
    public static void writeToTxt() throws Exception{
        //创建一个接收键盘输入数据的输入流
        InputStreamReader is = new InputStreamReader(System.in);

        //把输入流放到缓冲流里
        BufferedReader br = new BufferedReader(is);

        BufferedWriter out = new BufferedWriter(new FileWriter("F:\\DailyUse\\src\\day13\\tt7.txt"));

        String line = "";

        while((line = br.readLine()) != null){
            if (line.equals("over")) {
                break;
            }
            //读取的每一行都写入到指定的txt文件中
            out.write(line);
        }

        out.flush();
        br.close();
        is.close();
    }
}
