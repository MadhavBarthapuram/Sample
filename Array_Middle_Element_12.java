package day_3;
import java.util.*;
public class Array_Middle_Element_12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] arr3=new int[2];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr1[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			System.out.print("Enter the "+j+"th element:");
			arr2[j]=sc.nextInt();
		}
		
		int m1=arr1[arr1.length/2];
		int m2=arr2[arr2.length/2];
	
		arr3[0]=m1;
		arr3[1]=m2;
		
		for(int i:arr3) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
