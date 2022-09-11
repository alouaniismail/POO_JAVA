//mise en oeuvre du principe d'heritage.
//classe abstraite aussi dans les autres parties a suivre..²
//exemple1 va hériter de part1
//import part1; dans le fichier exemple1.java

package others_heritage;
public class part1
{
    public part1(String name)
    {
	System.out.println(name);
    }

    public void move(int x, int y)
    {
	value_x=x;
	value_y=y;
	System.out.println("guerrier en position"+x+";"+y);
    }
    
    public int getPosition_x(){return this.value_x;}
    public int getPosition_y(){return this.value_y;}
    private int value_x;
    private int value_y;
    protected int numero;
    protected int value_z;
}
