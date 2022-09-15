import abstraits.*;
public class main5
{
    public static void main(String[] args)
    {
	Lion li=new Lion();
	li.sleep();
	li.speak();
	//	System.out.println(li.mName);
	//mName has a protected access in Feline.
	//ca le rend pas utilisable dans une classe qui herite pas de Feline.
	System.out.println(li.getNameLion());
    }
}
