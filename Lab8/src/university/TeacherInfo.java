package university;

public class TeacherInfo { 
	private int teacherTotal = 0; 
	private double teacherSalary = 0; 
	
	public void setTotal(int amount) { 
		teacherTotal = amount; 
	} 
	public void setAvgSalary(double salary) { 
		teacherSalary = salary; 
	} 
	public int getTotal() { 
		return teacherTotal; 
	} 
	public double getAvgSalary() { 
		return teacherSalary; 
	}  
}