package day_3;
import java.util.*;
public class Max_Min_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		int max=0;
		
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		int min=max;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		
		System.out.println("The maximum number is:"+max);
		System.out.println("The minimum number is:"+min);
		sc.close();
	}
}
