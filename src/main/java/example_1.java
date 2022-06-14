public class example_1 {
    public static void main(String[] args) {
        int balance = 100000, increase = 500000;
        int TotalScore = NewBalance(balance, increase);
        System.out.println(TotalScore);
    }

    public static int NewBalance(int balance, int increase) {
        int sum;
        sum = balance + increase;
        return sum;
    }
}

// Переполнение инта
// Нельзя вводить слишком большие и слишком маленькие числа