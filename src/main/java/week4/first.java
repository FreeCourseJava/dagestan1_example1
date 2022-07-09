package week4;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 1, 3, 9, 4, 2};
        int left = 0;
        int right = array1.length- 1;
        int[] newArray = cocktailSort(array1, left, right);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] cocktailSort (int[] array, int left, int right) {
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int change = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = change;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int change = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = change;
                }
            }
            left++;
        } while (left <= right);
        return array;
    }
}

