package mypackage;
import java.util.Arrays;

public class PracticeProject9 {

	public static void main(String[] args) {
		
		int arr[]= {23,45,89,10,67,100,37,78};
		for(int i=0;i<arr.length;i++){
		System.out.println("Value of array at position "+i+" is "+arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted Array is: "+Arrays.toString(arr));
	}
	
}
