package week3;

import java.util.Arrays;

public class week3_third {
    public static void main(String[] args) {
        int[] date = {1920, 1438, 1240, 1990, 1796, 1680, 1438, +
                1552, 1796, 2015, 1708, 1236, 1725, 1723, 1759, 1805, 1918, 1952, 1937, 2012};
        for (int i = 0; i < date.length - 1; i++) {
            for (int j = 0; j < date.length - 1; j++) {
                if (date[j] > date[j + 1]) {
                    int plus = date[j + 1];
                    date[j + 1] = date[j];
                    date[j] = plus;
                }
            }
        }
        System.out.println(search((date),1938));
    }
        public static boolean search(int[] date, int example) {
        int low = 0;
        int high = date.length-1;
            for(; ;) {
                int middle = low + (high - low) / 2;
                if (example < date[middle]) {
                    high = middle - 1;
                } else if (example > date[middle]) {
                    low = middle + 1;
                } else {
                    return true;
                }
                if (low > high){
                    return false;
                }
            }
        }
    }

