package project3.domain;

/**
 * @author lt
 * @Description Equipment接口及其实现子类的设计
 * @data 8/1 - 8:27
 */

/**
 * <<interface>>
 * Equipment
 * + getDescription():String
 *
 * NoteBook
 * - model:String
 * - price:double
 * + NoteBook(model:String,price:double)
 *
 * PC
 * - model:String
 * - display:String
 * + PC(model:String,display:String)
 *
 * Printer
 * - name:String
 * - type:String
 * + Printer(name:String,type:String)
 */

/**
 * · 说明：
 * > model表示机器的型号
 * > display表示显示器名称
 * > type表示机器的类型
 * · 根据需要提供各属性的get/set方法以及重载构造器
 * · 实现类实现接口的方法，返回各自属性的信息
 */
public interface Equipment {
    //抽象方法getDescription()
    String getDescription();
}
