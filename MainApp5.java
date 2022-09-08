public class MainApp5
{
    public static void main(String[] args)
    {
	System.out.println("Voir le deroulement des fichiers dans le .txt\n\n");
	boolean value=(24==24);
	int value2=24;
        System.out.println(!value);
	//structures conditionnelles:
	if(value==true)
	    System.out.println("value=24");
	if(value==false)
	    System.out.println("value est différent de 24");
	//test ignoré, ne rendre pas dedans dans ce que va faire apres le if ok.
	if(value==true && value2 != 25)
	    System.out.println("value2==25");
	if(value==true && value2 == 25)
	    System.out.println("value2==25");
	else if(value2<30)
	    System.out.println("value vaut true mais value2 n'est pas =25");
	else
	    System.out.println("tu sais la valeur de value/value2.\n");
	int option=1;
	switch(option)
	    {
	    case 2: /*<=>if(option==1)*/
		System.out.println("option==2");
		break;
	    default:
		System.out.println("option==1 et voilà!\n\n\n");
		break;
	    }
	String choice="y";
	switch(choice)
	    {
	    case "n":
		System.out.println("OUI");
		break;
	    case "y":
		System.out.println("NON");
		break;
	    default:
		System.out.println("ni non ni yes (différent de String y/n)");
		break;
	    }
    }
}
