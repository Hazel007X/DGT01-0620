package grade;

import java.io.*;
import java.util.Scanner;

public class Command2 {
    public static void main(String[] args) {
        String name, grade;
        int score;

        try (
            FileReader infile = new FileReader("D:/eclipse/Lab6/java/Grade.txt");
            Scanner fileInput = new Scanner(infile);
            Scanner userInput = new Scanner(System.in)
        ) {
            System.out.print("Enter a grade: ");
            String targetGrade = userInput.nextLine();

            while (fileInput.hasNext()) {
                name = fileInput.next();  
                grade = fileInput.next();  
                score = fileInput.nextInt(); 

                if (grade.equalsIgnoreCase(targetGrade)) {
                    System.out.println(name + " " + score);
                }
            }
        } catch (IOException error) {
            System.out.println("เกิดข้อผิดพลาดในการอ่านไฟล์: " + error.getMessage());
        }
    }
}
