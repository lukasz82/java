public class MarsApplication
{
    public static void main(String[] args)
    {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "Eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();

        System.out.println("Zwiększenie prędosćci do 3");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemprature();
        spirit.showAttributes();

        System.out.println("\n\n\n");

        MarsRobot curriosy = new MarsRobot();

        curriosy.status = "Start";
        curriosy.speed = 4;
        curriosy.temperature = -20;
        curriosy.showAttributes();
        curriosy.checkStatus();

        System.out.println("Zmiana temperatury na 130");
        curriosy.temperature = 130;
        curriosy.status = "Stoję Za ciepło!!";
        curriosy.showAttributes();
        curriosy.checkStatus();
    }
}
