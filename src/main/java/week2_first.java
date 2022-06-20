
public class week2_first {
    public static void main(String[] args) {
        number(10);
    }

    public static void number(long days) {
        long millis;
        long total;
        millis = days * 86400000;
        long times = (System.currentTimeMillis());
        total = millis + times;
        System.out.println(total);

    }
}
