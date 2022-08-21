package week3;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
        arr[0] = 20;
        arr[3] = 15;
        arr[5] = 1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 6; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                count++;
            }
        }
        System.out.println(count);
    }
}
