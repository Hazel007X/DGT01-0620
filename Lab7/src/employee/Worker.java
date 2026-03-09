package employee;

public class Worker extends Employee {

    public double calSalary(){

        if(salary > 6000){
            return salary + 500;
        }
        else{
            return salary + 1000;
        }

    }

}