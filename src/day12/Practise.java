package day12;

import java.io.File;

/**
 * @author lt
 * @Description //需求：遍历F盘下的DailyUse的test文件夹所有的目录与文件遍历出来，不论层级有多深，要全部遍历出来
 * @data 8/30 - 9:43
 */
public class Practise {
    public static void main(String[] args) {
        File f = new File("F:\\DailyUse");
        new Practise().test(f);
    }

    //递归遍历文件
    public void test(File file){
        if(file.isFile()){
            System.out.println(file.getAbsolutePath() + "是文件");
        }else{
            System.out.println(file.getAbsolutePath() + "是文件夹");
            //文件夹可能存在子文件夹或者文件
            File[] fs = file.listFiles();//获取当前文件夹下的子文件夹或者文件的file对象
            if (fs != null && fs.length > 0) {//判断数组里必须有东西
                for (File ff : fs) {
                    test(ff);//递归
                    }
                }
            }

        }
    }
