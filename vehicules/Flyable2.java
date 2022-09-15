package vehicules;
interface Flyable2
{
    public void fly(String energy);
    default public void test()
    {
	System.out.println("Test");
    }
}
