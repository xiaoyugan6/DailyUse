package day07;

/**
 * @author lt
 * @data 7/14 - 9:01
 */

/*
 * 调用父类的构造器
 * ·子类中所有的构造器默认都会访问父类中控参数的构造器
 * ·当父类中没有空参数构造器时，子类的构造器必须通过this(参数列表)或者super(参数列表)语句指定调用本类或者父类中相应的构造器，
 *  且必须放在第一行
 * ·如果子类构造器中既未显式调用父类或本类的构造器，且父类中又没有无参的构造器，则编译出错
 *
 * *************************************************************
 * this和super的区别
 * No.  区别点         this                                                    super
 * 1    访问属性       访问本类中的属性，如果本类没有此属性则从父类中继续查找    访问父类中的属性
 * 2    调用方法       访问本类中的方法                                       直接访问父级中的方法
 * 3    调用构造器     调用本类构造器，必须放在构造器的首行                     调用父类构造器，必须放在子类构造器的首行
 * 4    特殊           表示当前对象                                           无此概念
 */

public class Kids extends ManKind{

//    public Kids(int sex,int salary){
//        //在父类只有有参构造可以使用的时候，子类必须显式的构建一个构造类调用父类的有参构造，并且调用父类构造方法要写在第一行
//        super(sex,salary);
//    }

//    public Kids(){
//        super();
//    }
    int yearOld;

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println(this.yearOld);
    }

    //重写了父类的employed方法
    @Override
    public void employed() {
//        System.out.println("kid should study no job");
        //修改练习1：1中定义的类Kids中的employed()方法，在该方法中调用父类ManKind的employed方法
        //然后再输出
        super.employed();
        System.out.println("kid should study no job");
    }

    public static void main(String[] args) {
//        Kids someKid = new Kids();//new Kids()是在调用Kids类的默认无参构造方法，在这个过程中就使用父类的无参构造
//        someKid.setSex(0);
//        someKid.setSalary(100);
//
//        someKid.manOrWoman();
//        someKid.employed();
    }

}
