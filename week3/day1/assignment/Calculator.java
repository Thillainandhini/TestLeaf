package week3.day1.assignment;

/*Method overlaoding --->compile time polymorphism
 * -class which have multiple method with same name but 1)diffrent no. of parameters or 2)diffrent type of the parameteters
 * -3)return type can be same or diffrent
 * 
 *  2 methods for add (1 method with 2 args, 1 method with 3 args)
- 2 methods for multiply (1 method with 2 int agrs, 1 method with 1 int arg and 1 double arg)
- 2 methods for subtract (1 method with 2 int args, 1 methods with 2 double args)
- 2 methods for divide (1 method with 2 int args, 1 methods with 1 double arg and 1 int arg)*/



public class Calculator {

	public static int  add (int num1 , int num2 )
	{
		int sum = num1+num2;
		System.out.println("Addition : "+sum);
		return sum;
	}
	public static int add(int num1 , int num2 , int num3 )
	{
		int sum1= num1+num2+num3;
		System.out.println("Addition : "+sum1);
		return sum1;
	}
	public static void multiply(int x, int y )
	{
		int multi = x*y;
		System.out.println("Multiplication : "+multi);
		return ;
		
	}
	public static void multiply (int x ,double y )
	{
		double multi1 = x*y;
		System.out.println("Multiplication :" +multi1);
		return ;
	}
	public int divide (int x, int y)
	{
		int div = x/y;
		System.out.println("Division :" +div);
		return div;
	
	}
	public double divide (double x, double y)
	{
		double div = x/y;
		System.out.println("Division :" +div);
		return div ;
	
	}
	public int substract (int x, int y)
	{
		int sub = x-y;
		System.out.println("Substaction :" +sub);
		return sub;
		
	}
	public double substract (int x, double y)
	{
		double sub = x-y;
		System.out.println("Substaction :" +sub);
		return sub;
		
	}
	
	public static void main(String[] args) {
	
		add(5,2);
		add(7,2,1);
		multiply(5,5);
		multiply(2,2.2d);
		 
		Calculator cal = new  Calculator();
		cal.divide(5.2d,2.2d);
	    cal.divide(6, 2);
	    cal.substract(6, 2.2d);
		cal.substract(8, 2);
		
	}

}