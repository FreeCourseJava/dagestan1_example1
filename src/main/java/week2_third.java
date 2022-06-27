
public class week2_third {
    public static void main(String[] args) {
        int balance = 2147483647;
        int increase = 1;
        int totalScore = newBalance(balance, increase);
        System.out.println(totalScore);
    }

    public static int newBalance(int balance, int increase) {
        int summa;
        long sum;
        sum =(long)balance + (long)increase;
        summa = balance + increase;
        if(sum == summa) {
            return summa;
        } else {
            return 0;
        }
    }
}
