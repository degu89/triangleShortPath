package suprnation.enrico.deguidi.TriangleShortestPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        //System.out.println( "START" );
        
        BufferedReader br = null;
    	List<String>  listLine= new LinkedList<String>();
    	 LinkedList<LinkedElement> linkedElement = null;
        try {
        	br= new BufferedReader(new InputStreamReader(System.in));
        	String line;
        	while ((line = br.readLine()) != null) {
        		//listLine.add(0, line);
        		linkedElement=shortestpathLinked( line, linkedElement);
        	//	System.out.println( line );
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
	        System.out.println( "INPUT ERROR" );
			e.printStackTrace();
		}
        
        
        //Element element = shortestpath(listLine);
        Element element = shortestpathLinked(linkedElement);

        System.out.println( printResult(element));
        

    }
    
    public static  List<Integer> splitText(String line) {
    	StringTokenizer tonkens = new StringTokenizer(line);
    	List<Integer> list = new LinkedList<Integer>();
    	 while (tonkens.hasMoreTokens()) {
    		 list.add(Integer.parseInt(tonkens.nextToken()));
         }
    	return list;
    }
    
    public static Element shortestpathLinked(LinkedList<LinkedElement> finalList) {
    	int minCost = finalList.getFirst().getCost();
    	LinkedElement link = finalList.getFirst();
    	for(LinkedElement element: finalList) {
    		if (element.getCost()<minCost) {
    			minCost = element.getCost();
    			link =element;
    		}
    		
    	}
    	Element result = new Element();
    	result.setCost(minCost);
    	ArrayList<Integer> path = new ArrayList<Integer>() ;
    	
    	while(link!=null) {
    		path.add(0, link.getValue());
    		link = link.getPrevious();
    	}

    	result.setPath(path);
    	return result;
    	
    }
    
    public static LinkedList<LinkedElement> shortestpathLinked(String line, LinkedList<LinkedElement> previousList) {
    	LinkedList<LinkedElement>  currentLevel= new LinkedList<LinkedElement>();
		List<Integer> splitList = splitText(line);
		if (previousList ==null) {
			LinkedElement e = new LinkedElement();
			e.setCost(splitList.get(0));
			e.setValue(splitList.get(0));
			currentLevel.add(e);
		}else {
			int  i=0;
			for (Integer node: splitList) {
				LinkedElement e = new LinkedElement();
				e.setValue(splitList.get(i));
				if (i ==0) {
					e.setCost(previousList.get(0).getCost()+node);
					e.setPrevious(previousList.get(0));

				}else if (i==previousList.size()){
					e.setCost(previousList.get(i-1).getCost()+node);
					e.setPrevious(previousList.get(i-1));
				}else {
					if (previousList.get(i-1).getCost()< previousList.get(i).getCost()) {
						e.setCost(previousList.get(i-1).getCost()+node);
						e.setPrevious(previousList.get(i-1));
						
					}else {
						e.setCost(previousList.get(i).getCost()+node);
						e.setPrevious(previousList.get(i));
						
					}
					
				}
				i++;
				currentLevel.add(e);	
			}
		}
    	return currentLevel;
    	
    }
    
    public static Element shortestpath(List<String> lineList) {
    	Element[] elementArray = null;
    	for(String s: lineList) {
    		List<Integer> splitList = splitText(s);
    		if(elementArray == null) {
    			elementArray= new Element[splitList.size()];
    			int  i=0;
    			for (Integer node: splitList) {
    				Element e = new Element();
    				e.setCost(node);
    				e.setPath(new LinkedList<Integer>());
    				e.getPath().add(node);
        			elementArray[i]=e;
        			i++;
    			}
    		}else {
    			int i =0;
    			for (Integer node: splitList) {
    				if (elementArray[i].getCost()<elementArray[i+1].getCost()) {
    					elementArray[i].setCost(elementArray[i].getCost()+node);
    					elementArray[i].getPath().add(0,node);
    				}else {
    					elementArray[i].setCost(elementArray[i+1].getCost()+node);
    					elementArray[i].setPath(new LinkedList<Integer>(elementArray[i+1].getPath()));
    					elementArray[i].getPath().add(0,node);
    				}
    				i++;
    			}
    		}
    		
    		
    	}
    	
    	return elementArray[0];
    	
    }
    public static String printResult(Element element) {
    	String result = "Minimal path is:";
    	boolean printPlus = false;
    	for(Integer i:element.getPath()) {
    		if (printPlus) 
    			result+=" + "+ i;
    		else {
    			result+=" "+ i;
    			printPlus= true;
    		}
    	}
    	 result+=" = "+element.getCost();

    	return result;
    }
    
    
    
    
    
    
}
