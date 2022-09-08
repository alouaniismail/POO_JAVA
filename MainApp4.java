public class MainApp4
{
    public static void main(String[] args){
	int age=24;
	System.out.println(age);
	System.out.println("Tu as\t"+ age +"\tans");
	//concatenation pour rassembler $ en javascript
	//interpolation de chaines de characteres.
	int result=5/2;
	int result2=5%2;
	System.out.println(result);
	System.out.println(result2);
	int number=4;
	result=number;
	System.out.println(result);
	int result3=4+5*2;
	System.out.println(result3);
	int result4=(4+5)*2;
	System.out.println(result4);
	int rslt=14;
        boolean myvar=true;
	System.out.println(myvar);
	System.out.println(!myvar);
	/*boolean rslt_comparaison=(rslt=="14");
	  System.out.println(rslt_comparaison);*/
	//pas possible comme en javascript(~tolérance des erreurs).
	int experience=0;
	System.out.println(experience);
	experience=10;
	System.out.println(experience);
	experience=100;
	System.out.println(experience);
	int goldCoins=0;
	goldCoins+=10;
	goldCoins+=100;
	System.out.println(goldCoins);
	int nb1=1;
	int nb2=nb1++;
	//int nb3=++nb1;
	System.out.println(nb1);
	System.out.println(nb2);
	int nb3=++nb1;
	System.out.println(nb3);
	boolean rslt_fin= 14 < 25;
	System.out.println(rslt_fin);
    }
}
