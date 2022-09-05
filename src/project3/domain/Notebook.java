package project3.domain;

/**
 * @author lt
 * @Description 笔记本
 * @data 8/1 - 8:55
 */
public class Notebook implements Equipment{
    private String model;//机器型号
    private double price;//价格

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Notebook() {
        super();
    }

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
