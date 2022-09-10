//import java.util.StringTokenizer;
public class ex4
{
    public static void main(String[] args)
    {
	StringBuffer sBuffer=new StringBuffer();
	sBuffer.append(" tout le monde");
	sBuffer.insert(0,"Bonjour");
	System.out.println(sBuffer);
	String s1="a";
	String s2="b";
	String res=s1+s2;
	System.out.println(res);
	StringBuilder res2=new StringBuilder().append(s1).append(s2);
	System.out.println(res2.toString());//et voilà.
    }
}
