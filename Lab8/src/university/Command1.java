package university;

public class Command1 { 
    public static void main(String[] args) { 
            
     StdInfo info1 = new StdInfo(); 
        info1.setTotal(20000);     
         
     TeacherInfo info2 = new TeacherInfo(); 
        info2.setTotal(200); 
        info2.setAvgSalary(30000.00);     
         
        University u1 = new University(); 
        u1.setStdInfo(info1); 
        u1.setTeacherInfo(info2); 
         
        System.out.printf("The university consists of %d students", u1.getStdInfo()); 
        System.out.printf(" and %d teachers.\n", u1.getTeacherInfo().getTotal()); 
        System.out.printf("The average salary of teachers is abount %.2f Baht.", 
u1.getTeacherInfo().getAvgSalary()); 
     
    } 
} 
