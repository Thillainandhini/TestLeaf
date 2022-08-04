package JavaChallenge;


public class SquareRoot {
	
	
	
public void perfectSq(int x) {
		
		int a, r;
	
		//double c;
		//double d;
		
		for (int i = 0; i <=x; i++) {
			
			a =i*i;
			if(a==x) {
				
				System.out.println("Perfect square root: " +i);
				
				break;
			}
			else if((a!=x)&&(a>x)) {
				
				r = i-1;
			
				System.out.println("Non perfect square root: " +r);
				
			/*	c=x/r;
				d = (r+c)/2;
				System.out.println(d);	*/
				break;
				
			}

		}	
		
		
	}
		
		public static void main(String[] args) {
		
		SquareRoot num = new SquareRoot();
		num.perfectSq(2154);
					

	}


}
