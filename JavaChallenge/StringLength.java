package JavaChallenge;

public class StringLength {
public void lastword(String name) {
		
		int count = 0;
		
		String[] split = name.split(" ");
		//System.out.println(split.length);
		
			for (int i = 0; i < split.length; i++) {
			
					count++;
			
				if(count==split.length) {
					
					System.out.println("Last word is: " +split[i]);
					
					System.out.println("Length is: " +split[i].length());
					
				}		
		
		}
		

	}
	
	
	
	public static void main(String[] args) {
		
		StringLength obj = new StringLength();
		obj.lastword("Good Vibes");
		obj.lastword("live the Life");
		obj.lastword("live the moment");
		obj.lastword("think what you want");
		obj.lastword("Learn Automation Testing ");
		
		
	}



}
