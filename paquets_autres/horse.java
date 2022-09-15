package paquets_autres;
public class horse
{
    public horse(String name)
    {
	this.mName=name;
	this.mPosX=50;
	this.mPosY=50;
    }
    public void move(int x, int y)//avec final non redifinie avec l'entitee qui va
    //heriter de ceci.
    {
	this.mPosX=x;
	this.mPosY=y;
    }
    protected String mName;
    protected int mPosX;
    protected int mPosY;
    //on met un protected pour dire que ceux la peuvent etre traitees
    //par des methodes de l'entitee qui va heriter.
    //et aussi logiquement par la class predefinie horse.class.
}
    
