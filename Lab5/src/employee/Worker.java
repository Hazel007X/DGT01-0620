package employee;

public class Worker extends Employee {
    private double bonus;

    public void calBonus() {
        if (getID() > 100) {
           
            bonus = getIncome() * 4;
        } else if (getID() >= 10) {
           
            bonus = getIncome() / 2.0;
        } else if (getID() > 0) {
           
            bonus = getIncome() / 3.0;
        } else {
            
            bonus = 0;
        }
    }

    public double getBonus() {
        return bonus;
    }
}
