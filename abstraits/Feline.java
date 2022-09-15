package abstraits;
abstract public class Feline
{
    protected String mName;
    abstract public void sleep();
    abstract public void speak();
    /*{
	System.out.println("Roraar !!");
	}*/
    //abstract method cannot have a body. 
}
//classe abstraites: generalisation (en plus de l'heritage)
//protected peut y acceder depuis l'entitee qui herite et logiquement la
//classe mere.
//on rend abstrait quelques methodes qu'on doit implementer en entier dans
//la partie qui va heriter.
