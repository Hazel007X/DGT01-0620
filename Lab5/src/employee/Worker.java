package employee;

public class Worker extends Employee {
    private double bonus;

    public void calBonus() {
        if (getID() > 100) {
            bonus = getIncome() / 3.0;
        } else {
            bonus = getIncome() / 2.0;
        }
    }

    public double getBonus() {
        return bonus;
    }
}
