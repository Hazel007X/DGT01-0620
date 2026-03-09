package employee;

abstract public class Employee {

    protected int id;
    protected double salary;

    abstract double calSalary();

    public void setID(int empID){
        id = empID;
    }

    public void setSalary(double empSalary){
        salary = empSalary;
    }

}