public class sr
{
    public sr(int expiration)
    {
	if(mNumberOfRegistrations>0)
	    {
		
	this.mExpiration=expiration;
	System.out.println("Enregistrement du produit valide, valide jusqu'en " + this.mExpiration);
	mNumberOfRegistrations--;
	System.out.println("Logiciel valide(expiration: " + this.mExpiration + ")");
	System.out.println("Enregistrements restants: " + this.mNumberOfRegistrations);
	    }
	else
	    {
		System.out.println("Maximun de validation effectuées");
	    }

	  
    }
    // private int mExpiration;

    //pas de static sinon relie au fichier soit a la classe definissant le
    //fichier java.
    
    public int getExpirationYear(){
	return this.mExpiration;//pas de static=>accessibilite de données
	//privées au sein de la classe.
    }

    public void setExpirationYear(int myExpirationYear){
	this.mExpiration=myExpirationYear;
    }


    public static int getNumberRestants(){
	return mNumberOfRegistrations;
	//this c'est pour un attribut soit VARIABLE
	//pas une variable fixée à l'avance.
    }
    
    private int mExpiration;//public par defaut.
    private static int mNumberOfRegistrations=5;
    //ON POURRAIT LA MODIFIER A L'INTERIEUR MEME DU CONSTRUCTEUR.
    //comme une variable statique a 100 pour 100.
    //private static<=>variable de classe .
    
}
