import java.io.*;
import java.util.*;

public class Gab {

    public static void main(String[] args) throws IOException
    	{
    		//Writer writer = new FileWriter("D:\\asd\\Input_name);
    		Scanner scan = new Scanner(System.in);
    		String Fileko;
    		String Input_name;
    			
    		
    		System.out.println("Enter your file name: ");
    		Input_name = scan.nextLine();
    		Writer writer = new FileWriter(Input_name +".gil");
    		
    		System.out.println("Enter a words: ");
    		Fileko = scan.nextLine();
    		
    		writer.write(Fileko);
    		writer.close();
    		
    }
    
    
}