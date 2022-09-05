package ObjectExer;

/**
 * @author lt
 * @data 6/9 - 14:27
 */
public class Person {

    String name;
    int age;
    int sex;

    /**
     * sex = 1 男
     * sex = 0 女
     */

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){//alt + 左 返回
        System.out.println("age" + age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }

}
