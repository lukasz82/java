public class Weather {
    public static void main(String[] args) {
        double fah = 86;
        System.out.println(fah + " stopni Farenheita to ...");
        fah -= 32;
        fah = (fah / 9) *5;
        System.out.println(fah + " Stopni celcjusza \n\n");

        double cel = 30;
        System.out.println(cel + " stopni celcjusza to ...");
        cel = ((cel*9) /5) + 32;
        System.out.println(cel + " Stopni Farenheita \n\n");
    }
}
