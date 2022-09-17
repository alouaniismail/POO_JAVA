package pm;
abstract public class vehicules
{
    protected int type;
    protected int immatriculation;
    /*
2 attributs du type du véhicule et de son immatriculation plus son
proprietaire
    */
    protected String owner;
    abstract public void changingOwner(String name);
    abstract public void changingImmatriculation(int newOne);
    abstract public int getTypeCar();
    abstract public String getOwner();
}
