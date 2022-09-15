package batiments;
interface Flyable
{
    public void fly2(String energy);
    default public void test()
    {
	System.out.println("Test");
    }
}
