import java.util.StringTokenizer;
public class ex3
{
    public static void main(String[] args)
    {
	String s="news/titre-de-la-news/14";
	StringTokenizer st=new StringTokenizer(s,"/",true);
	//sans le true, le /(slash) ne s'affiche pas. 
	System.out.println(st);
	while(st.hasMoreTokens())
	    System.out.println(st.nextToken());
	StringBuilder sBuilder=new StringBuilder();
	System.out.println(sBuilder.capacity());	
	System.out.println(sBuilder.length());
	StringBuilder sBuilder2=new StringBuilder("Bonjour");
	System.out.println(sBuilder2.capacity());
	System.out.println(sBuilder2.length());
	sBuilder2.append(" tout le monde");
	System.out.println(sBuilder2);
	StringBuilder sBuild=new StringBuilder("Bon");
	sBuild.insert(3,"jour");//spécifier où il faut insérer le truc.
	System.out.println(sBuild);//et voilà.
    }
}
