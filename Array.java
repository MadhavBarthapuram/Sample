package day_3;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
