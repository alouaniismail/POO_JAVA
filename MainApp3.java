public class MainApp3
{
    public static void main(String[] args)
    {
	int ageUtilisateur=25;
	System.out.println("ageUtilisateur");
	System.out.println(ageUtilisateur);
	ageUtilisateur=24;
	System.out.println(ageUtilisateur);
	final int NUMBER=26;
	System.out.println(NUMBER);
	//NUMBER=14;
	//System.out.println(NUMBER);
	//final mot clé pour déclarer pour déclarer les constantes.
	final double PI=3.14;//c'est un double!(type de PI)
	System.out.println(PI);
    }
    public void autreMethode(){
	/*Steteme.out.println(ageUtilsiateur);*/
	//portée d'une variable via static.
	//garbage collector rôle => libération de mémoire de &ageUtilisateur.
    }
}
