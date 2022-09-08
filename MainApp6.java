public class MainApp6
{
    public static void main(String[] main)
    {
	int i=0;
	while(i!=10)
	    {
		System.out.println(i);
		i+=1;
		if (i==5)
		    //break;
		    continue;//le if ne sert a rien dans ce cas-ci.
	    }
	int j=0;
	do
	    {
		j++;
		if(j==5)
		    continue;
		System.out.println(j);
	    }while(j!=10);

	for(int k=0;k<=10;++k){
	    System.out.println("\n"+k);
	}
	for(int k2=0;k2<10;k2++){
	    System.out.println("\n"+k2);
	}
	//identifiques au fait de compte comme on a aspiré à le concrétiser.
    }
}
