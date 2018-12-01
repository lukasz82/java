public class MarsRobot implements Robot
{
    String status;
    int speed;
    float temperature;

    public void checkTemprature()
    {
        if (temperature < -80)
        {
            status = "powrot do domu";
            speed = 5;
        }
    }

    public void checkStatus()
    {
        System.out.println("Status: " + status);
    }

    void showAttributes()
    {
        System.out.println("Status: " + status);
        System.out.println("Prędkosc wynosi: " + speed);
        System.out.println("Temperatura wynosi: " + temperature);
    }
}
