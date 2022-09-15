package abstraits;
//rend cela dans le package=>faire rentrer par utilisation reciproque
//<=>import inutile mais dans le main utile.
public class Lion extends Feline
{
    public Lion()
    {
	mName="Lion";//protected pas private ici=>faire la différence
	//au niveau des traitements du constructeur
	//soit pas de this.mName;//.///
    }
    public void sleep(){//implémentation au niveau de cette sous-"entite"<<<
	//de la methode abstraite sleep();//.///
	System.out.println("Je dors 16 heures par jour..");
    }
    //la methode speak est abstraite et implementee en Feline.java
    //=>possiblite(pas de final en description typee) de la redefinir ici.
    public void speak()
    {
	System.out.println("Je rugis..");
    }
    public String getNameLion()
    {
	return this.mName;
    }
    //elle herite;elle peut ajouter de nouvelles fonctionnalitées
    //via de nouvelles methodes dans Lion.class.///////
}
