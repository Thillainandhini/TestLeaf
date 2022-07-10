package week1.day2;

public class Firefox {
	
	float version = 100.2f  ;
	   String  name = "firefox" ;
	  boolean  visible = true ;
	  int  year = 1998 ;
	 char   logo = 'm' ;

	 public void edge() {
		
		float version =100.2f;
		String  name = "firefox" ;
		System.out.println("version :" +version+ '\n'+ "name :"+name);
	}
	
		public void chrome() {
		
		int speed =1200;
		System.out.println("speed :" +speed);
	}
	
		public static void main(String[] args) {
		
 Firefox test= new Firefox();
 test.edge();
 test.chrome();
 		
	}

}
