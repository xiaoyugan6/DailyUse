package day08;

/**
 * @author lt
 * @Description 练习
 * @data 7/20 - 14:32
 */
// 练习
// 请根据以下代码自行定义能满足需要的MyData类，在MyData类中覆盖equals方法，
// 使其判断当两个MyData类型对象的年月日都相同时,结果为true，否则为false。public boolean equals(Object o)
public class MyData {
    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    int year;
    int month;
    int day;

    @Override
    public boolean equals(Object obj) {
        int flag = 1;
//flag现在的值为0，如果要是有一组值不相等就会+1，如果全都不相等flag就是3，2个不相等就是2，只有全都相等，flag才是0
        if (obj instanceof MyData){
            MyData md = (MyData) obj;
            flag = 0;

            if(this.year != md.year){
                flag += 1;
            }
            if(this.month != md.month){
                flag += 1;
            }
            if(this.day != md.day){
                flag += 1;
            }
        }
        if(flag == 0){
            return true;
        }else {
            return false;
        }

    }

//父类Object的toString方法就是输出当前对象的内存地址；
//如果你想要输出类的其他信息，重写toString方法
    @Override
    public String toString() {
        String str = this.year + "-" + this.month + "-" + this.day;
        return str;
    }
    
}
