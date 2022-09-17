package pm;
public class voiture extends vehicules implements Interface
{
    public voiture(int info1,int info2,String info3)
    {
	this.immatriculation=info2;
	this.owner=info3;
	this.type=info1;//number for type .
    }
    public void changingOwner(String name)
    {
	this.owner=name;
    }
    public void changingImmatriculation(int newOne)
    {
	this.immatriculation=newOne;
    }
    public int getTypeCar()
    {
	return this.type;
    }
    public int numberInTheCity()
    {
	return this.immatriculation*10 +4;
    }
    public String getOwner(){
	return this.owner;
    }
}
