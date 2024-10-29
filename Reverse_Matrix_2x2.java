package day_3;
public class Reverse_Matrix_2x2 {
	public static void main(String[] args) {
		int[][] arr= {{1,2},{3,4}};
		System.out.println("Original_Matrix");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Reversed_Matrix");
		for(int i=1;i>=0;--i) {
			for(int j=1;j>=0;--j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
