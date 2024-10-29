package day_3;
import java.util.Arrays;
public class Remove_10_ShiftRight {
    public static void main(String[] args) {
        int[] arr1 = {1, 10, 10, 2};
        int[] arr2 = new int[arr1.length];
        int index = 0;

        for (int num : arr1) {
            if (num != 10) {
                arr2[index] = num;
                index++;
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Modified array: " + Arrays.toString(arr2));
    }
}
