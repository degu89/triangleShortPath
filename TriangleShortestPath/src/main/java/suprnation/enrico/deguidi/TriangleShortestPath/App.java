package suprnation.enrico.deguidi.TriangleShortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
        System.out.println( "START" );
        
        BufferedReader br = null;
        try {
        	br= new BufferedReader(new InputStreamReader(System.in));
        	String name;
        	while ((name = br.readLine()) != null) {

        		System.out.println( name );
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
	        System.out.println( "ERROR" );
			e.printStackTrace();
		}

        
        System.out.println( "END" );

    }
    
    
}
