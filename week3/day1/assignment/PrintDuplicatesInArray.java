package week3.day1.assignment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// get the length of the array
		int arr_length = arr.length;
		
		System.out.println("Duplicates Array Element : ");
		//iterate from 0 to the array length-1
		for(int i=0;i<=arr_length-1;i++) {
			//iterate from i to the length of the array by adding 1 to it 
			for(int j=i+1;j<arr_length;j++) {
				// compare both the loop variables & check they're equal
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
	
	}
}