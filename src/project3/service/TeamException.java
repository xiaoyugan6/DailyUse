package project3.service;

/**
 * @author lt
 * @Description 自定义异常类
 * @data 8/8 - 21:05
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387516993124229948L;//UID保证传输对象时两端能够识别类

    public TeamException(){
        super();
    }

    public TeamException(String msg) {
        super(msg);
    }
}
