package project3.service;

import project3.domain.*;

import static project3.service.Data.*;
/**
 * @author lt
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @data 8/2 - 14:48
 */

/**
 * 1.按照要求设计要求编写NameListService类
 * 2.在NameListService类中临时添加一个main方法中，作为单元测试方法。
 * 3.在方法中创建NameListService对象，然后分别用模拟数据调用该对象的各个方法，以测试是否正确。
 *   注：测试应细化到包含了所有非正常的情况，以确保方法完全正确。
 * 4.重复1-3步，完成TeamService类的开发。
 */

/**
 * NameListService
 * - employees：Employee[]
 * + NameListService()
 * + getAllEmployees()：Employee[]
 * + getEmployee(int id)throws TeamException:Employee
 */

/**
 * · 说明：
 * > employees用来保存公司所有员工对象
 * > NameListService()构造器：
 *   √ 根据项目提供的Data类构建相应大小的employees数组
 *   √ 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类对象
 *   √ 将对象存于数组中
 *   √ Data类位于service包中
 */

/**
 * · 说明：
 * > getAllEmployees()方法，获取当前所有员工。
 *   √ 返回：包含所有员工对象的数组
 * > getEmployee(id：int)方法：获取指定ID的员工对象。
 *   √ 参数：指定员工的ID
 *   √ 返回：指定员工对象
 *   √ 异常：找不到指定的员工
 * · 在service子包下提供自定义异常类：TeamException
 * · 另外，可根据需要自行添加其他方法或重载构造器
 */
public class NameListService {
    // 根据项目提供的Data类构建相应大小的employees数组
    // 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类对象
    // 将对象存于数组中

    private Employee[] employees;

    //对数组及数组元素进行初始化
    public NameListService(){
        //1.根据根据项目提供的Data类构建相应大小的employees数组
        employees = new Employee[EMPLOYEES.length];

        //2.再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer、Architect对象，以及相关联的Equipment子类的对象
        //3.将对象存于数组中
        for(int i = 0;i < employees.length;i++){
            //获取员工类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);//包装类：String转int

            //获取Employee的4个基本信息(公共属性)
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            //非公共属性
            Equipment equipment;
            double bonus;
            int stock;

            switch(type){
                case EMPLOYEE://10
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER://11
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER://12
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT://13
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    /**
     * @Description 获取指定index上的员工设备
     * @param index
     * @return
     */
    private Equipment createEquipment(int index) {

        int key = Integer.parseInt(EQUIPMENTS[index][0]);

        String modelOrName = EQUIPMENTS[index][1];

        switch(key){
            case PC://21
                String display = EQUIPMENTS[index][2];
                return new PC(modelOrName,display);
            case NOTEBOOK://22
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new Notebook(modelOrName,price);
            case PRINTER://23
                String type = EQUIPMENTS[index][2];
                return new Printer(modelOrName,type);
        }

        return null;
    }

    /**
     * @Description 获取当前所有员工
     * @return
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     *
     * @Description 获取指定ID的员工对象
     * @param id
     * @return
     */
    public Employee getEmployee(int id) throws TeamException {
        for(int i = 0;i < employees.length;i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }

        throw new TeamException("找不到指定的员工");//TeamException继承Exception，先抛出，再最后调用方法时整体去try/catch
    }

}