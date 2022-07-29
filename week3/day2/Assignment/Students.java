/*
      Class: Students
      Methods: getStudentInfo()
Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
*/
package week3.day2.Assignment;

public class Students {  
	
	public int getStudentInfo(int id)
	{
		return id;
	}
 public void getStudentInfo(int id,String name) {
       System.out.println("Enter id : "+ id +" "+"Enter Name : "+name);
}
 public void getStudentInfo(String email,long phonenumber)
 {
	 System.out.println("Enter Mail ID: "+email+" "+   "Enter Phone Number :"+phonenumber);
 }
 public static void main(String[] args) {
	Students st=new Students();
	st.getStudentInfo(10);
	st.getStudentInfo(456, "nandhini");
	st.getStudentInfo("abcd@gmail.com",  44841393);
	
}
}