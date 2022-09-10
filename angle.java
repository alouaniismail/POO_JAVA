import java.lang.Math.*;
public class angle
{
    //static hors du main
    //ou bien dans un fichier compilé en .class après puis un autre fichier
    //class différent CETTE FOIS qui contiendra l'utilisation
    //la compilation se fait des 2 fichiers en meme temps avec javac.
    public static void main(String[] args)
    {
	ANGLE ang1=new ANGLE(90,false);
	System.out.println(ang1.sinus());//sin(pi/2)===1. JUSTE.
	ANGLE ang2=new ANGLE(45,false);
	ANGLE ang3=ang1.add(ang1,ang2);
	ang3.affichage();
	System.out.println(Math.sin(135*Math.PI/180));
	System.out.println(ang3.sinus());//C'est les memes juste.///
	ANGLE[] angles={null,null,null};
	for(double i=0;i<3;++i){
	    int j=(int)i;
	    angles[j]=new ANGLE(i*Math.PI/3,true);
	}
	System.out.println(angles[1].sinus());
	System.out.println(angles[1].get_value());//ce qui est juste en vérifiant avec l'interface node dans le terminal.
    }
	
    static public class ANGLE
    {
	
	private boolean degre_radian;//0 degre 1 radian.
    private double valeur;

	public ANGLE(double ang,boolean value)
	{
	    if(value==false) 
		this.degre_radian=false;
	    else
		this.degre_radian=true;
	    this.valeur=ang;
	}
	public ANGLE(double ang)
	{
	    this.valeur=ang;
	}
	public ANGLE()
	{
	    this.degre_radian=true;
	    this.valeur=0;
	}
	public boolean access_type(){
	    return this.degre_radian;
	}
	public void set_type(double valeur_type){//changement degre_radian.
	    int a;
	    if(this.degre_radian==false) a=0;
	    else a=1;
					 
	    int b=(a+1)%2;
	    if(b==0)
		this.degre_radian=false;
	    else
		this.degre_radian=true;
	    if(this.degre_radian==false){
		this.valeur*=Math.PI;
		this.valeur/=180;
	    }
	    if(this.degre_radian==true){
		this.valeur*=180;
		this.valeur/=Math.PI;
	    }
	    this.valeur=valeur_type;
	}
	public void set_value(double ang){
	    this.valeur=ang;
	    //sans se soucier de l'angle;c'est le meme pour les deux dernieres
	    //methodes d'instance.
	}
	public double get_value(){
	    return this.valeur;
	}
	public double convert_to_degre(ANGLE v){
	    //si v est en radian
	    if(v.degre_radian==true)
		return (((v.valeur)*180)/Math.PI) ;
	    return v.valeur;
	}
	public ANGLE add(ANGLE ang1, ANGLE ang2)
	{
	    ANGLE res=new ANGLE();
	    res.set_value(convert_to_degre(ang1)+convert_to_degre(ang2));
	    res.degre_radian=false;
	    return res;
	}
	public double degre(){
	    return convert_to_degre(this);
	}
	public void affichage(){
	    if(this.degre_radian==false) System.out.println(this.valeur+""+"°");
	    if(this.degre_radian==true) System.out.println(this.valeur+""+"RAD");
	}
	public double sinus(){
	    double value_cible;
	    if(this.degre_radian==false) value_cible=(((this.valeur)*Math.PI)/180);
	    else value_cible=(double)this.valeur;
	    return Math.sin(value_cible);
	}
    }
}
