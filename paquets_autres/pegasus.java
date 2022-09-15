package paquets_autres;
public final class pegasus extends horse
{
    //non heritable avec final.

    //les protected rendent la classe en privée pour les attributs
    //utilisation de this au sein d'une méthode est autorisée et
    //ne genere pas d'erreur.
    public pegasus(String name)
    {
	super(name);
	this.mPosZ=100;
    }
    public void move(int x, int y)
    {
	super.move(x,y);
	System.out.println("Le pegase se deplace (X=" +this.mPosX +"," + "Y="+this.mPosY +")");
    }
    public void fly(int z)
    {
	this.mPosZ=z;
    }
    private int mPosZ;
}
