package university;

public class University { 
    private StdInfo student; 
    private TeacherInfo teacher; 
     
    public void setStdInfo(StdInfo s) { 
        student = s; 
    } 
     
    public int getStdInfo() { 
        return student.getTotal(); 
    }     
 
    public void setTeacherInfo(TeacherInfo t) { 
        teacher = t; 
    } 
     
    public TeacherInfo getTeacherInfo() { 
        return teacher; 
    }  
} 