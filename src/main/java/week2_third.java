
public class week2_third {
    public static void main(String[] args) {
        int balance = 2147483646;
        int increase = 1;
        int TotalScore = NewBalance(balance, increase);
        System.out.println(TotalScore);
    }

    public static int NewBalance(int balance, int increase) {
        int summa;
        long sum;
        long balanceL;
        long increaseL;
        balanceL = (long) balance;
        increaseL = (long) increase;
        sum = balanceL + increaseL;
        if (sum > Integer.MAX_VALUE) {
            return 0;
        } else if (sum < Integer.MIN_VALUE) {
            return 0;
        } else {
            summa = (int) sum;
            ;
            return summa;
        }
    }
}
