package employee;


public class Manager extends Employee {
    private double tax;

    public void calTax() {
        if (getIncome() > 50000) {
            tax = getIncome() * 0.04;
        } else {
            tax = getIncome() * 0.03;
        }
    }

    public double getTax() {
        return tax;
    }
}


