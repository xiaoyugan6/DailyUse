package day08;

/**
 * @author lt
 * @Description 练习
 * @data 7/20 - 11:18
 */

/**
 * 练习：编写Order类，有int型的orderId，String型的OrderName，相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法;public boolean equals(Object obj),并判断测试类中创建的两个对象是否相等。
 */
public class Order {
    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    int orderId;
    String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    //重写快捷键：ctrl + o
    @Override
    public boolean equals(Object obj){
        boolean flag = false;
        if(obj instanceof Order){
            Order o = (Order) obj;

            if(this.orderId == o.orderId && this.orderName.equals(o.orderName)){
                flag = true;
            }
        }
        return flag;
    }

}
