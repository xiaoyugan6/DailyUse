package project3.domain;

/**
 * @author lt
 * @Description 设计师
 * @data 8/2 - 11:22
 */
public class Designer extends Programmer{
    private double bonus;//奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    //5     雷军  28  10000.0     设计师     FREE    5000.0      激光(佳能2900)
    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }

    //3/5   雷军  28  10000.0 设计师     5000.0
    public String getDetailsForTeam(){
        return getTeamBaseDetails() + "\t设计师\t" + getBonus();

    }

}
