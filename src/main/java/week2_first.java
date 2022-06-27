
public class week2_first {
    public static void main(String[] args) {
        number(10);
    }

    public static void number(long days) {
        long millis, total;
        millis = days * 24 * 60 * 60 * 1000;
        long times = (System.currentTimeMillis());
        total = millis + times;
        System.out.println(total);

    }
}
