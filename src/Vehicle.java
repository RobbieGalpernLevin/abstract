abstract public class Vehicle
{
    private int wheels;
    private int speed;

    public Vehicle(int w, int s)
    {
        wheels = w;
        speed = s;
    }

    abstract public void startVechicle();
}
