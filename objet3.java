public class objet3
{
    public static void main(String[] args)
    {
	player p1=new player();
	player p2=new player("Jason");
	player p3=new player("Jason",1);
	p1.attack();
	p2.attack();
	p3.attack();//ce sont les memes
	//pas player (nom) => pas constructeur meme public reste le mot cle
	//avant le type de retour.
    }
}
//static dans l'autre fichier independamment de la classe player ou se trouve.
//cela depend cest a dire un sans static permet indepedemment de player de l'appeler.
