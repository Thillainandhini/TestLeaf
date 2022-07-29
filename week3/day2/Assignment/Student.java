package week3.day2.Assignment;



public class Student extends Department {
	public void studentName() {
System.out.println("studentname");
	}
	public void studentDept() {
System.out.println("studentdepartment");
	}
	public void studentId() {
System.out.println("Id");
	}
public static void main(String[] args) {
	Student st=new Student();
	st.collegeName();
	st.collegeCode();
	st.collegeCode();
	//st.deptName();
	st.studentName();
	st.studentDept();
	st.studentId();
	
}
}