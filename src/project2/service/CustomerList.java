package project2.service;

/**
 * @Description CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
 *              供CustomerView调用
 * @author lt
 * @data 7/15 - 16:55
 */

import project2.bean.Customer;

/**
 * 本类封装以下信息：
 * Customer[] customers;用来保存客户对象的数组
 * int total = 0;记录已保存客户对象的数量
 */

/**
 * 该类至少提供以下构造器方法：
 * public CustomerList(int totalCustomer)
 * public boolean addCustomer(Customer customer)
 * public boolean replaceCustomer(int index,Customer cust)
 * public boolean deleteCustomer(int index)
 * public Customer[] getAllCustomers()
 * public Customer getCustomers(int index)
 * public int getTotal()
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 用来初始化customers数组的构造器
     * @param totalCustomer：指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description 将指定的客户添加到数组中
     * @param customer
     * @return true：添加成功 false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        
//        customers[total] = customer;
//        total++;
        //或
        customers[total++] = customer;
        return true;
    }
    /**
     * @Description 修改指定索引位置的客户信息
     * @author lt
     * @date 2022/7/18 11:34
     * @param index
     * @return true:修改成功 false：修改失败
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引上的客户
     * @param index
     * @return true:删除成功 false：删除失败
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for(int i = index;i < total - 1;i++){
            customers[i] = customers[i + 1];
        }

        //最后有数据的元素需要置空
//        customers[total] = null;
//        total--;
//        return true;
        //或
        customers[--total] = null;
        return true;
    }

    /**
     * @Description 获取所有客户的信息
     * @return
     */
    public Customer[] getAllCustomers(){
//        return customers;
        Customer[] custs = new Customer[total];
        for (int i = 0;i < total;i++){
            custs[i] = customers[i];//地址
        }
        return custs;
    }

    /**
     * @Description 获取指定索引位置上的客户
     * @param index
     * @return 如果找到了元素，则返回;如果没有找到，则返回null
     */
    public Customer getCustomer(int index){
        if(index < 0  || index >= total){
            return null;
        }

        return customers[index];
    }

    /**
     * @Description 获取存储的客户数量
     * @return
     */
    public int getTotal(){
        return total;
//      return customers.length;错误的
    }

}
