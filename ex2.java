public class ex2
{
    public static void main(String[] args)
    {
    String s1="Bonjour";
    String s2="tout le monde";
    System.out.println(s1.concat(" ").concat(s2));
    System.out.println(s1.toUpperCase());
    System.out.println(s1);
    System.out.println(s1.replace("A",""));//inverse de toUpperCase remet le place;les 2 ont un effet de bord.
    System.out.println(s1);
    System.out.println(s1.replace("o","bb"));//non effet de bord..
    System.out.println(s1);
    s1="Bonjour";//contenu immuable.
    System.out.println(s1);
    //trim() ne compte pas les espaces=>effet debord(pas d'implication en fait
    //ici).
    System.out.println(s1.charAt(2));
    s2=s1.substring(1,3);
    System.out.println(s2);
    System.out.println(s1);//verification seulement ; on sait deja la reponse.
    //autre maniere, tant qu'on y est deja.
    System.out.println(s2.equals(s1));
    System.out.println(s1.equals(s2));

    String ss1="abc";String ss2="abc";
    System.out.println(ss1.compareTo(ss2));
    }
}
