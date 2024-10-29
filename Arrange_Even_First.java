package day_3;
import java.util.Scanner;
public class Arrange_Even_First {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+i+"th element:");
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]%2==0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
