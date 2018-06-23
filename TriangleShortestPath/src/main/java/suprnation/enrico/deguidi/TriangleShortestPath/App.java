package suprnation.enrico.deguidi.TriangleShortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

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
    
    public static  List splitText(String line) {
    	StringTokenizer tonkens = new StringTokenizer(line);
    	List<Integer> list = new LinkedList<Integer>();
    	 while (tonkens.hasMoreTokens()) {
    		 list.add(Integer.parseInt(tonkens.nextToken()));
         }
    	return list;
    }
    
    
}
