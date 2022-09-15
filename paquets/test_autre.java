package paquets;
import paquets.animal;
public class test_autre extends animal
{
    public test_autre()
    {
	super();
	//car elle est declaree en public=>utilisation externe possible.
    }
    //private String espece;
    //possible
    //ou bien en protected et agissement ici.
    public void setAnimalEspece(String s)
    {
	this.espece=s;
    }
    public String getAnimalEspece()
    {
	return this.espece;
    }
    //là oui.
    //mais private String animalName signifie que l'entite heritante
    //ne pourra pas y acceder meme avec this soit les traitements(2)
    //specifiques a cela se retrouve dans la classe mère.
	
}
