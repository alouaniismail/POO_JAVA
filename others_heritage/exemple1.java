
//qui sera herite de part1
//cad. contiendra tout ce que contient part1 avec des infos en plus.

package others_heritage;
import others_heritage.part1;

public class exemple1 extends part1
{
    public exemple1(String name)
    {
	super(name);
    }

    public void set_z(int z)
    {
	this.value_z=z;
    }

     public void set_numero(int num)
    {
	this.numero=num;
    }

    
    public void getPosition()
    {
	int x=getPosition_x();
	int y=getPosition_y();
	set_numero(0);
	set_z(100);
		System.out.println("La position du guerrier numero:"+this.numero+"est"+x+";"+y+";"+this.value_z);
    }
}
