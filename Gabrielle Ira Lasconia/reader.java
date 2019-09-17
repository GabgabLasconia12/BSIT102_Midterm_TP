import java.io.*;
import java.util.*;


public class reader 
{

    public static void main (String[] args) throws IOException
    	{
    		System.out.println("Enter your file: ");
    		Scanner sc = new Scanner(System.in);
    		
    		File fffile = new File(sc.nextLine() +".gil");
    		sc = new Scanner(fffile);
    		
    		String lineko = sc.nextLine();
    		System.out.println(lineko);
    		
    		sc.close();
    		
    }
    
    
}