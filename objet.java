public class objet
{
    public static void main(String[] main)
    {
	System.out.println("HELLO!!!\n");
	cat miaou=new cat("chat1",12);
	cat miaou2=new cat("chat2",14);

	/*System.out.println(miaou.mName);*/
	//attributs privés.
	//afficher();//pas possible
	afficher2();
	
    }
    public void afficher()
    {
	System.out.println("afficher le message:...");
    }
    public static void afficher2()
    {
	System.out.println("afficher le message2:...");
    }
    //static relatif a la classe le byte code
    //=>passage obligeatoire.
}
