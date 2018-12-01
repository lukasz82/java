public class Zadanie3_1
{
    public static void main(String[] args)
    {
        double inwest = 14_000;
        double wynik = ((inwest *1.4) - 1500) *1.12;
        System.out.println("Inwestycja byłaby warta: " + wynik);

        double x,y;
        x = 5;
        y = 3;
        System.out.println((x/y) + "\t" + (x%y));

        int liczba_dziesietna = 10;
        System.out.println(Integer.toBinaryString(liczba_dziesietna));
        System.out.println(Integer.toOctalString(liczba_dziesietna));
        System.out.println(Integer.toHexString(liczba_dziesietna));
    }
}
