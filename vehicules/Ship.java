package vehicules;
public class Ship extends Vehicle implements Flyable2
{
    public Ship()
    {
	this.mMovementSpeed=16;
    }
    public void mMoveXY(int x, int y)
    {
	System.out.println("Le navire brasse les flots et se déplace en "+ x +","+y);
    }
    public void fly(String energy)
    {
	System.out.println("ENERGIE: "+energy);//TOUT SIMPLE.
    }
    public void test()
    {
	System.out.println("That's a normal testing interface");
    }
}
