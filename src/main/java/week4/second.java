package week4;

public class second {
    public static void main(String[] args) {
        int[] date = {1920, 1438, 1240, 1990, 1796, 1680, 1438, +
                1552, 1796, 2015, 1708, 1236, 1725, 1723, 1759, 1805, 1918, 1952, 1937, 2012};
        int[] dateSorted = bubbleSort(date);
        int low =0;
        int hight = date.length-1;
        System.out.println(binarySearch((dateSorted), 1937, low, hight));
    }

    private static int[] bubbleSort(int[] date) {
        int[] newArray = date;
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    int change = newArray[j + 1];
                    newArray[j + 1] = newArray[j];
                    newArray[j] = change;
                }
            }
        }
        return newArray;
    }

    public static int binarySearch(int[] date, int example, int low, int hight) {
        if (low <= hight) {
            int middle = low + (hight - low) / 2;
            if (date[middle] > example) {
                return binarySearch(date, example, low, middle - 1);
            } else if (date[middle] < example) {
                return binarySearch(date, example, middle + 1, hight);
            } else {
                return middle;
            }
        }
        return -1;
    }
}
