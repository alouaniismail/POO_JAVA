public class objet2
{
    public static void main(String[] args)
    {
	/*prog();
	  prog();*/
	//plutot que de mettre en commentaire les deux (proprietes de JAVA+)
	loadWindow();
	loadSprite();
	animateSprite();
	System.out.println(getNumberTwo());
	System.out.println(test());
	say("Hello");
	/*	System.out.println(msg);//attention(remarque dominante precedente).*/
	String msg="MESSAGE: HELLO!!!----------------";
	say(msg);
	//2 fois car passe par la derniere tout cela dans la classe objet2.
	//et on execute le byte-code objet2.
	System.out.println(sum(2,3));
	System.out.println(sum(2.5,3.3));
    }
    public static void prog()
    {
	System.out.println("Bonjour");
	System.out.println("Comment allez-vous ?");
    }
    public static void loadWindow()
    {
    }
    public static void loadSprite()
    {
    }
    public static void animateSprite()
    {
    }
    //debut: acces information via une classe declaree dans le main
    //permet l'acces en gros mais non car specifique a la classe: STATIC.
    //a ne pas confondre avec le mot clef : private/final avec modif.(erreurs)
    public static int getNumberTwo()
    {
	return 2;//le retour<=>la modification a l'exterieur non
	//rejoint la remarque precedente.
    }
    public static int test()
    {
	boolean value=true;
	if(value)
	    {
		return 1;
	    }
	return 0;
    }
    public static void say(String msg)
    {
	msg="------------BONSOIR---------------------------------------";
	System.out.println(msg);
    }
    public static int sum(int a, int b)
    {
	return a+b;
    }
    public static double sum(double a, double b)
    {
	return a+b;
    }//sum avec int;double est une surcharge de méthodes.
	 
}
