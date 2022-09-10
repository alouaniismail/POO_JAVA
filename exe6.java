

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class exe6 {

    public static void main(String[] args) throws IOException {
        // Create Reader to read a file.
        Reader reader = new FileReader("./file_test");

        // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
        BufferedReader br = new BufferedReader(reader, 16384);
    
        String line = null;
        
        while((line = br.readLine())!= null) {
            System.out.println(line);
        }
        br.close();
	InputStreamReader sr=new InputStreamReader(System.in);
	BufferedReader bfr=new BufferedReader(sr,16384);
	System.out.println("Comment t'appelles-tu? ");
	String line2=null;
        line2=bfr.readLine();
	System.out.println(line2);


	Scanner sc=new Scanner(System.in);
	try
	    {
		System.out.println("Annee de naissance: ");
		int yearOfBirth=sc.nextInt();
		System.out.println(yearOfBirth);
	    }
	catch(InputMismatchException e)
	    {
		System.out.println("la date est incorrecte.");
		e.printStackTrace();
		System.out.println("ERREUR: "+e.getMessage());
	    }
	catch(Exception e)
	    {
		System.out.println("autre erreur.");
	    }
	finally
	    {
		System.out.println("ok");
	    }
    }
}
