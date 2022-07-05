package week3;

import java.util.Arrays;

public class week3_second {
    public static void main(String[] args) {
        int[] date = {1920, 1438, 1240, 1990, 1796, 1680, 1438, +
                1552, 1796, 2015, 1708, 1236, 1725, 1723, 1759, 1805, 1918, 1952, 1937, 2012};
        for (int i = 0; i < date.length-1; i++) {
            for (int j = 0; j < date.length-1; j++) {
                if(date[j] > date[j+1]) {
                    int plus = date[j+1];
                    date[j+1] = date[j];
                    date[j] = plus;
                }
            }
        }
        System.out.println(Arrays.toString(date));
    }
}
