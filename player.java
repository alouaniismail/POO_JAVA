public class player
{
    public player()
    {
	System.out.println("Unkown"+" a le niveau"+"??");
    }

    public player(String name)
    {
	this.level=0;
	this.name=name;
	System.out.println(this.name+"a le niveau"+this.level);
    }

    public player(String name, int level)
    {
	this.name=name;
	this.level=level;
	System.out.println(name+"a le niveau"+level);
    }

    public void attack(){
	System.out.println(this.name+" attaque la cible en question");
    }
    private String name;
    private int level;
}
