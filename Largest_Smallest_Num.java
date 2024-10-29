package day_3;
import java.util.*;
public class Largest_Smallest_Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("First 2 Max elements: "+arr[arr.length- 1]+" "+arr[arr.length - 2]);
		System.out.println("First 2 Min elements: "+arr[0]+" "+arr[1]);
		sc.close();
	}
}
