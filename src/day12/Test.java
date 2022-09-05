package day12;

import java.io.File;
import java.io.IOException;
/**
 * @author lt
 * @Description io、File类
 * @data 8/25 - 9:30
 */

/**
 * java.io.File类的使用：计算机操作系统中的文件和文件夹
 * IO原理及流的分类
 * 文件流（数据流的读写都是基于文件的操作）
 * FileInputStream / FileOutputStream / FileReader / FileWriter
 * 缓冲流（数据流的读写都基于内存的操作）
 * BufferedInputStream / BufferedOutputStream / BufferedReader / BufferedWriter
 * 转换流
 * InputStreamReader / OutputStreamWriter
 * 标准输入/输出流
 * 打印流（了解）
 * PrintStream / PrintWriter
 * 数据流（了解）
 * DataInputStream / DataOutputStream
 * 对象流--涉及序列化、反序列化（把一个对象转换为一个数据流进行读写）
 * ObjectInputStream / ObjectOutputStream
 * 随机存取文件流（例如有一个txt文件，其中有100行数据，可以直接读取第50行的数据，也可以在第89行插入数据）
 * RandomAccessFile
 */

/**
 * File类
 * File能新建、删除、重命名文件和目录，但File不能访问文件内容本身。如果需要访问文件内容本身，则需要使用输入/输出流。
 * File对象可以作为参数传递给流的构造函数
 * File类的常见构造方法：
 *     public File(String pathname)
 *        以pathname为路径创建File对象，可以是绝对路径或者相对路径，如果pathname是相对路径，则默认的当前路径在系统属性user.dir、
 *        中存储。
 *     public File(String name,String child)
 *        以parent为父路径，child为子路径创建File对象。
 * File的静态属性String separator存储了当前系统的路径分隔符。
 * 在UNIX中，此字段为'/',在Windows中，为'\\'
 * File类代表与平台无关的文件和目录
 * File能新建、删除、重命名文件和目录，但File不能访问文件内容。如果需要访问文件内容本身，则需要使用输入/输出流。
 *
 */

public class Test {
    public static void main(String[] args) {
        File f = new File("F:\\DailyUse\\test\\abc\\tt.txt");//这个时候对象f就是tt.txt这个文件
        File f4 = new File("F:\\DailyUse\\test\\abc");//目录
//        File f2 = new File("F:/DailyUse/test/abc/tt.txt");
//        File f3 = new File("F:" + File.separator +"DailyUse\\test\\abc\\tt.txt");
//        File f1 = new File("F:\\DailyUse\\test","abc\\tt.txt");//这个f1也是tt.txt文件，这种使用相对比较少

        //注意，\在文件中是路径的分隔符，在java编程中一个\是转义符，\\或者/才是文件的分隔符
        //也可以File.separator作为文件分隔符
        System.out.println(f.getName());//获取文件名
        System.out.println(f4.getName());
        System.out.println(f.getPath());//获取当前路径

        File f5 = new File("src/day12/Test.java");//使用相对路径来创建file对象

        System.out.println(f5.getPath());//获取文件或者文件夹的路径，就是new file的时候写的路径
        System.out.println(f5.getAbsolutePath());//获取当前文件的绝对路径

        System.out.println(f5);
        System.out.println(f5.getAbsoluteFile());//返回一个用当前的文件的绝对路径构建的file对象

        System.out.println(f5.getParent());//返回父级路径

        f.renameTo(new File("F:\\DailyUse\\test\\abc\\tt1.txt"));//重命名文件（夹）


        System.out.println(f5.exists());//文件是否存在
        System.out.println(f5.canWrite());
        System.out.println(f5.canRead());
        System.out.println(f5.isFile());
        System.out.println(f5.isDirectory());//是否文件夹

        System.out.println(f5.lastModified());//获取文件最后修改时间，返回毫秒数
        System.out.println(f5.length());

        File f8 = new File("F:\\DailyUse\\test\\abc\\tt2.txt");
        System.out.println(f8.exists());
        if(!f8.exists()){
            try {
                f8.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        f8.delete();

        File f9 = new File("F:\\DailyUse\\test\\abc\\cc");
        f9.mkdir();//创建单层，创建多层mkdirs

        File f11 = new File("F:\\DailyUse\\test");
        String[] fl = f11.list();//返回当前文件夹的子集的名称，包括目录和文件
        for (String s : fl){//foreach
            System.out.println(s);
        }

        File[] fs = f11.listFiles();//返回的是当前文件夹的子集的file对象，包括目录和文件
        for (File ff : fs){
            System.out.println(ff);
        }

    }
}
