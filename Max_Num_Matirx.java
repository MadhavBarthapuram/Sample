package day_3;
import java.util.*;
public class Max_Num_Matirx {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of the Matrix:");
		int l=sc.nextInt();
		System.out.println("Enter the Width of the Matrix:");
		int w=sc.nextInt();
		int [][] arr=new int[l][w];
		for(int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				System.out.println("Enter the "+"["+i+"]"+"["+j+"]"+" Element:");
				arr[i][j]=sc.nextInt();
			}
		}
		int max=0;
		for(int i=0;i<l;i++) {
			for(int j=0;j<w;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println("The maximum Number in the Matrix:"+max);
		sc.close();
	}
}
