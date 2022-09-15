package vehicules;
public class Glider extends Vehicle
{
    public Glider()
    {
	this.mMovementSpeed=28;
    }
    public void mMoveXY(int x, int y)
    {
	System.out.println("Le planneur fend l'air vers" + x +"," + y);
    }
}
