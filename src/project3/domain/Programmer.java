package project3.domain;

import project3.service.Status;

/**
 * @author lt
 * @Description Programmer(程序员)
 * @data 8/1 - 15:19
 */

/**
 * Programmer
 * - memberId:int
 * - status:Status = FREE
 * - equipment:Equipment
 * + Programmer(id:int,name:String,age:int,salary:double,equipment:Equipment)
 */

/**
 * · 说明：
 * > memberId用来记录成员加入开发团队后在团队中的ID
 * > Status是项目service包下自定义的类，声明三个对象属性，分别表示成员的状态。
 *   √ FREE-空闲
 *   √ BUSY-已加入开发团队
 *   √ VACATION-正在休假
 * > equipment表示改成员领用的设备
 * · 可根据需要为类提供各属性的get/set方法以及重载构造器
 */
public class Programmer extends Employee{

    private int memberId;//开发团队中的id
    private Status status = Status.FREE;
    private Equipment equipment;

    //快速展开/折叠方法： Ctrl + shift + "+/-"
    public Programmer(){
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    //3 李彦宏     23  7000.0  程序员     FREE    戴尔(NEC17寸)
    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getTeamBaseDetails(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    //2/6 任志强   22  6800.0  程序员
    public String getDetailsForTeam(){
        return getTeamBaseDetails() + "\t程序员";

    }

}
