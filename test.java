public class test
{
    
    public static void main (String[] args)
    {
	tree t1=new tree();//tree$tree@6ff3cb5b5 logique !!!!
	System.out.println(t1);
	int[] t={3,4,5};
	tree t2=new tree(t);
	int tt=t2.transfo(10,20,30);
	int tt2[]={tt,tt,tt};
	tree t3=new tree(tt2);//factorisation du code VIA des methodes
	//permettre dans un constructeur indirectement de faire une une factorisation enutilisant un autre constructeur basique. 
	System.out.println(t1.var3==t2.var3);
	System.out.println(t2.var3==t3.var3);
    }
    static public class tree //il faut ajouter static !!!
   {
        public tree()
	{
	    int[] t=new int[]{1,2,3};
	    this.var1=t[0];
	    this.var2=t[1];
	    this.var3=t[2];
	}


       public tree(int[] t)
       {
	    this.var1=t[0]-t[0]+1;
	    this.var2=t[1]-t[1]+2;
	    this.var3=t[2]-t[2]+3;
	}
       public int transfo(int a, int b, int c){
	   return a+b+c;
       }
        
	public void tree_modify(int var11,int var22,int var33)
	{
	    this.var1=var11-var11+1;
	    this.var2=var22-var22+2;
	    this.var3=var33-var33+3;
	}
	
	private int var1;
	private int var2;
	int var3;
       }
    
}

