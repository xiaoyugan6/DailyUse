package day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author lt
 * @Description 这是描述会唱歌的厨子是一个老师的类
 * @data 7/27 - 8:04
 */
public class SCTeacher extends Person1 implements Cooking,Sing{
    String course;//科目

    public void setInfo(){
        super.age = 27;
        super.name = "王富贵";
        super.sex = 1;

        this.course = "数学";
    }

    @Override
    public void showInfo() {
        System.out.println("会唱歌的厨子是一个老师的信息是：");
        System.out.println(super.age);
        System.out.println(super.name);
        System.out.println(super.sex);
        System.out.println(this.course);
    }

    @Override
    public void fry() {
        System.out.println(super.name + "老师拿手的厨艺是炒菜");
    }

    @Override
    public void singing() {
        System.out.println(super.name + "老师擅长美声唱法");
    }

}
