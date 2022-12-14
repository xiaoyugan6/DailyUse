package project3.domain;

/**
 * @author lt
 * @Description 显示器
 * @data 8/1 - 8:59
 */
public class Printer implements Equipment{

    private String name;//机器型号
    private String type;//机器类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }

}
