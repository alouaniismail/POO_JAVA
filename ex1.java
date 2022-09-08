import java.util.Arrays;
public class ex1
{
    public static void main(String[] args)
    {
	int[] tab = new int[3];
	int[] tab1,tab2=new int[5];
	//tab2[0]=10;
	for(int i=0;i<5;i++)
	    {
		System.out.println(tab2[0]);//initialisation à 0.
	    }
	//autres syntaxes à savoir impérativement:
	int[] tab3=new int[]{1,2,3};
	//pas de taille mais explicitement le contenu voulue!
	int j=0;
	while(j<tab3.length)
	    {
		System.out.println(tab3[j]);
		j++;
	    }
	int tab4[]={1,2,3};//comme en C.
	int k=0;
	do{
	    System.out.println(tab4[k]);
	    k++;
	}while(k!=3);
	//mais pas de declaration de taille car suivant le dernier cas
	//;les element sont donnees.
	System.out.println("------------------\n\n");
	int tab5[]={1,2,3,4,5};
	for(int el:tab5)
	    System.out.println(el);
	
	int tab6[][]=//de meme que int[][] tab6.
	    {
	    {1,2,3},
	    {4,5,6}
	};
	System.out.println("------------------\n\n");
	for(int i2=0;i2<=1;++i2)
	    for(int j2=0;j2<=2;++j2)
		System.out.println(tab6[i2][j2]);
	System.out.println("------------------\n\n");
	for(int[] i3:tab6)
	    for(int number:i3)
		System.out.println(number);
	System.out.println("------------------\n\n");
	//derniere maniere de s'y prendre.
	for(int ii=0;ii<=tab6.length-1;++ii){
	    for(int jj=0;jj<=tab6[ii].length-1;++jj){
		System.out.println(tab6[ii][jj]);
	    }
	}
	printTab(tab5);
	System.out.println(tab5.toString());//ca va donner quelque chose de bizarre ; inclus des trucs differents mais pas du tout a 100% de ce sens.
	int tab10[]=new int[10];
	Arrays.fill(tab10,15);
	printTab(tab10);
    }
    public static void printTab(int[] tab){
	for(int el:tab)
	    System.out.println(el);
    }
}
