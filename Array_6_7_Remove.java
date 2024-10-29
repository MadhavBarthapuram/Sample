package day_3;
public class Array_6_7_Remove {
    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean b = false;
        for (int num : arr) {
            if (num == 6) {
                b= true;
            } else if (num == 7) {
                b = false;
            } else if (!b) {
                sum += num;
            }
        }
        System.out.println("Sum of the Array: " + sum); 
    }
}
