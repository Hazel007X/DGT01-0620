package employee;

import java.util.Scanner;

public class Command2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int id;
        double salary;

        System.out.print("Enter your id: ");
        id = input.nextInt();

        System.out.print("Enter your salary: ");
        salary = input.nextDouble();

        if(id < 0){
            System.out.println("Invalid ID " + id + "!!");
        }
        else if(id <= 500){

            Manager m = new Manager();
            m.setID(id);
            m.setSalary(salary);

            System.out.println("You are Manager.");
            System.out.printf("Your new salary is %.2f Baht.\n", m.calSalary());

        }
        else{

            Worker w = new Worker();
            w.setID(id);
            w.setSalary(salary);

            System.out.println("You are Worker.");
            System.out.printf("Your new salary is %.2f Baht.\n", w.calSalary());

        }

    }

}