package student;

import java.util.Scanner;
public class Command1 {
 public static void main(String[] args) {

 float score=0;
String course;
Scanner sc = new Scanner(System.in);
System.out.print("Enter your course name: ");
course = sc.next();
System.out.print("Enter your score: ");
score = sc.nextFloat();

Graduate John = new Graduate();

John.setScore(course, score);
John.computeGrade();

System.out.println("You get Grade " + John.getGrade() + " in " + John.getCourse());
 }
}
