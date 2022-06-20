public class week2_second {
    public static void main(String[] args) {
        int balance = 2147483647;
        int increase = 1;
        int TotalScore = NewBalance(balance, increase);
        System.out.println(TotalScore);
    }

    public static int NewBalance(int balance, int increase) {
        int sum;
        sum = balance + increase;
        if(sum >= 0) {
            return sum;
        } else {
            return 0;
        }
    }
}

