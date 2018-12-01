public class incDec {
    public static void main(String[] args) {
        int x = 42;
        int y;

        y = x++;
        System.out.println(y);
        System.out.println(x);

        int a = 0, b;
        b = a++ + a++;
        System.out.println(b);
    }
}
