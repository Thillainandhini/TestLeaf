package week3.day2.Assignment;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.python();
		auto.ruby();
		auto.selenium();
		auto.java();
	}
	public void selenium()
	{
		System.out.println("Selenium");
	}
	public void java() {
        System.out.println("Java");		
	}
	//override
	public void ruby() {
		System.out.println("Ruby");
	}
}