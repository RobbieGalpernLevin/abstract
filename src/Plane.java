public class Plane extends Vehicle
{
    private int wings;

    public Plane(int w, int s, int wing)
    {
        super(w, s);
        wings = wing;
    }


    public void startVechicle()
    {
        System.out.println("Press buttons");
    }
}
