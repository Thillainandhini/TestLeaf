package week1.day2;

public class Calculator {

	//addition
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
		//subtraction
	public void sub(int a, float b) {
	
	    System.out.println(a-b);
	}
	 //multi
	public void mul(double a,int b,double c) {
		System.out.println(a*b*c);
	}
	
	//division
	public void div(long a,double b,float c) {
		System.out.println(a/b/ c);
	}
	
	
	 public static void main(String[] args) {
	Calculator cal=new Calculator();
     cal.add(12,10);
     cal.sub(20, 10.6f);
     cal.mul(2, 3, 4);
     cal.div(18l, 20, 9.0f);

     
	 }}