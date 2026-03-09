package employee;

public class Manager extends Employee {

    public double calSalary(){

        if(id > 300){
            return salary + (salary * 0.06);
        }
        else{
            return salary + (salary * 0.04);
        }

    }

}