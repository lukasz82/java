import java.text.DecimalFormat;

public class Sample {
    //psvm

    int c;
    static final double PI2 = 3.14;

    public static void main(String[] args) {
        {
            int a = 2;
            String name;

            name = "Łukasz";
            Sample sample = new Sample();
            System.out.println(name + sample.c);

            String firstName = "Tomek";
            String lastName = "Kowalski";

            MarsRobot nowy = new MarsRobot();
            nowy.checkStatus();

            byte b = -10;
            short c = 123;
            double d = 123.1123312331;
            float f = 123.11f;
            char z = 'a';

            final double pi = 3.14;
            final String imie;
            imie = "Piotr";
            System.out.println(PI2);
            long literal = 500_000; // 500000
            System.out.println(literal);
            double potega = 10e10;
            System.out.println(potega);
            DecimalFormat df = new DecimalFormat(" #.##########");
            System.out.println(df.format(potega));

            int bin = 0b101;
            System.out.println(bin);
            boolean bool = true;
            System.out.println(bool);
            System.out.println("raz \t dwa \t trzy \t");
            System.out.println("raz \u2122");
        }
        {
            int x = 5;
            x =+ 5;
            System.out.println(x);

            int y = 2;
            System.out.println(x/(double)y);
        }
    }
}
