public class objet4
{
    public static void main(String[] args)
    {
	sr sr1=new sr(2020);
	/*int value=sr1.mExpiration;
	value=2050;
	System.out.println(value);*/
	//pour la facon normale par defaut attribut de l'objet instancie public.
	//mais via des méthodes publics se réglant uniquement au niveau
	//(localement) de la classe possible avec les nouveaux méthodes
	//setters et les accesseurs.
	System.out.println(sr1.getExpirationYear());
	sr1.setExpirationYear(2050);
	System.out.println(sr1.getExpirationYear());
	sr sr2=new sr(2022);
	System.out.println(sr2.getNumberRestants());
    }
}
