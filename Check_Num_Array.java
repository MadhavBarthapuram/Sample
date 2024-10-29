package day_3;
import java.util.Scanner;
public class Check_Num_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to find:");
		int num=sc.nextInt();
		sc.close();
		boolean flag=false;
		int i=0;
		for(i=0;i<n;i++) {
			if(arr[i]==num) {
				flag=true;
				break;
			}			
		}
		
		if(flag==true) {
			System.out.println(i);
		}
		else {
			System.out.print(-1);
		}
	}
}
