package week3;

import java.util.Arrays;

public class second {
    public static void main(String[] args) {
        int[] date = {1920, 1438, 1240, 1990, 1796, 1680, 1438, +
                1552, 1796, 2015, 1708, 1236, 1725, 1723, 1759, 1805, 1918, 1952, 1937, 2012};
        int[] dateSorted = bubbleSort(date);
        System.out.println(Arrays.toString(dateSorted));
    }

    private static int[] bubbleSort(int[] date) {
        for (int i = 0; i < date.length - 1; i++) {
            for (int j = 0; j < date.length - 1; j++) {
                if (date[j] > date[j + 1]) {
                    int change = date[j + 1];
                    date[j + 1] = date[j];
                    date[j] = change;
                }
            }
        }
        return date;
    }
}
