package paquets;
public class animal
{
    public animal()
    {
	System.out.println("instanciation d'un type d'espece");
    }
    
    private String animalName;//specifique a animal.class
    
    protected String espece;//specifique a test_autre.class (heritage)
    
    public String getAnimalName()
    {
	return this.animalName;
    }
    public void setAnimalName(String name)
    {
	this.animalName=name;
    }
    //getters-setters sur l'attribut animalName.
}
