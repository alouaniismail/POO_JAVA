import pm.*;
public class main7
{
    public static void main(String[] args)
    {
	voiture car=new voiture(101,987656,"Doog Thimons");
	System.out.println(car.getTypeCar());
	System.out.println(car.numberInTheCity());
	car.changingImmatriculation(987657);
	System.out.println(car.numberInTheCity());
	System.out.println("-----------------------");
	//Le polymorphisme marche seulement sur des methodes abstraites.
	//C'est un concept qui permet de regrouper plusieurs objets derives
	//de classe qui utilise la même classe (soit le concept en soi)
	//en une seule entité via un tableau de type la classe suivi de []
	//bien sur.
	vehicules[] tab={new voiture(100,99999,"no one"),new voiture(101,987657,"Jerry Solano")};
	System.out.println(tab[0].getOwner());
	System.out.println(tab[1].getOwner());
	Interface[] tab2={new voiture(100,99999,"no one"),new voiture(101,987657,"Jerry Solano")};
	System.out.println(tab2[0].numberInTheCity());
	System.out.println(tab2[1].numberInTheCity());
	//Important: les methodes apres utilises derive du type de classe
	//choisi soit une classe PUBLIQUE soit un interface public.
	//là, ça permet de ne pas s'accorder des propriétées en commun MAIS
	//DE rassembler un ensemble d'entitées partageant des propriétées
	//Intéressantes entre eux (communes), c'est là d'où vient la force
	//des interfaces et du polymorphisme en question.
    }

   
    
}
