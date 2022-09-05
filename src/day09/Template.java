package day09;

/**
 * @author lt
 * @Description 模板设计模式(TemplateMethod)
 * @data 7/26 - 9:51
 */
public abstract class Template {
    public abstract void code();

    public final void getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();

        System.out.println("code方法执行的时间：" + (end - start));
    }
}

class TestTmp extends Template{
    @Override
    public void code() {
        int k = 0;
        for(int i = 0;i < 50000;i++){
            k += i;
        }
        System.out.println(k);
    }
}
