package day_3;
import java.util.Scanner;
public class Matrix_Middle_Elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height of the Matrix:");
		int h=sc.nextInt();
		System.out.println("Enter the width of the Matrix");
		int w=sc.nextInt();
		int[][] arr1=new int[h][w];
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.println("Enter the "+"["+i+"]"+"["+j+"]"+" Element:");
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(j==1) {
					System.out.println(arr1[i][1]);
				}
			}
		}
		sc.close();
	}
}
