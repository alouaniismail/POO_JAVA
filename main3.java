import paquets.test_autre;
public class main3
{
    public static void main(String[] args)
    {
	test_autre lion=new test_autre();
	lion.setAnimalName("lion");
	System.out.println(lion.getAnimalName());
	lion.setAnimalEspece("felin");
	System.out.println(lion.getAnimalEspece());
    }
}
