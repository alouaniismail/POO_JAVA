public class cat
{
    /*public cat()
    {
	System.out.println("Je suis un chat " + this);
	}*/
    
    //modification du constructeur.
    
    public cat(String mName, int mAge)
    {
	this.mName=mName;
	this.mAge=mAge;
	System.out.println(this.mName + "-" + this.mAge);
    }
    
    private String mName;
    private int mAge;
    //privation seulement à la classe
    //on ne peut pas y accéder depuis l'extèrieur.
}
