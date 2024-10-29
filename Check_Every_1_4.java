package day_3;
import java.util.*;
public class Check_Every_1_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i:arr) {
			if(i==1 || i==4) {
				flag=true;
			}
			else {
				flag=false;
				System.out.print(false);
				break;
			}
		}
		if(flag) {
			System.out.print(true);
		}
		sc.close();
	}
}