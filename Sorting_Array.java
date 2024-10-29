package day_3;
public class Sorting_Array {
	public static void main(String[] args) {
		int[] arr= {1,5,7,3,7,34,9};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i: arr) {
			System.out.println(i);
		}
	}
}
