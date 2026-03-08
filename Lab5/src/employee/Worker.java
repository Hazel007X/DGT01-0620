package employee;

public class Worker extends Employee {
    private double bonus;

    public void calBonus() {
        bonus = getIncome() * 4; 
    }

    public double getBonus() {
        return bonus;
    }
}
