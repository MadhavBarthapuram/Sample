package day_3;
import java.util.*;
public class Sum_Average_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("The sum of the array is:"+sum);
		double avg=sum/arr.length;
		System.out.println("The average of the array is:"+ avg);
		sc.close();
	}
}
