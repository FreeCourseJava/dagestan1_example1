public class week2_third {
    public static void main(String[] args) {
        int balance = 2147483647;
        int increase = 1;
        int TotalScore = NewBalance(balance, increase);
        System.out.println(TotalScore);
    }

    public static int NewBalance(int balance, int increase) {
        int sum;
        sum = balance + increase;
        if (balance + increase >= 0) {
            return sum;
        } if (balance >= 0 && increase >= 0) {
            return 0;
        } else if (balance + increase >= -2147483647) {
                return sum;
        } else {
            return 0;
        }
    }
}

