public class Car extends Vehicle
{
    private int numKeys;

    public Car(int w, int s, int keys)
    {
        super(w, s);
        numKeys = keys;
    }


    public void startVechicle()
    {
        System.out.println("Turn Key");
    }
}
