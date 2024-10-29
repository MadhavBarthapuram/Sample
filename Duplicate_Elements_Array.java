package day_3;
import java.util.Arrays;
public class Duplicate_Elements_Array {
    public static void main(String[] args) {
        int[] arr1 = {12, 34, 12, 45, 67, 89};
        int[] arr2 = new int[arr1.length];
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < temp; j++) {
                if (arr1[i] == arr2[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr2[temp] = arr1[i];
                temp++;
            }
        }
        System.out.print("Unique array: "+Arrays.toString(arr2));
    }
}
