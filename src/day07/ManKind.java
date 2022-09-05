package day07;

/**
 * @author lt
 * @data 7/14 - 8:53
 */
//练习1
public class ManKind {
    public ManKind(){
        System.out.println("Mankind");
    }
//当存在显示的构造方法时，类就没有默认的无参构造了，而是要使用显示的构造
    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }

    int sex;
    int salary;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if(this.sex == 1){
            System.out.println("man");
        }else if(this.sex == 0)
            System.out.println("woman");
    }

    public void employed(){
        if(this.salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }
    }

}
