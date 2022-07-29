package week3.day1;

import java.util.Arrays;

public class FindMinMax {
	public static void main(String[] args) {
		
		int [] a= {2,70,100,40,8,11};
		int length = a.length;
		Arrays.sort(a);
		System.out.println("Minimum number : "+a[0]);
		System.out.println("Maximum number : "+a[length-1]);
		
	}

}
