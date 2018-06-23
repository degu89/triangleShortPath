package suprnation.enrico.deguidi.TriangleShortestPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
public class TestShortestPath {
	
	final static String line0= "0";
	final static String line1= "1 2";
	final static String line2= "3 4 5";
	final static String line3= "6 7 8 9";
	final static String line4= "10 11 12 13 14";

	@Test
	public void testShortPath1(){
		LinkedList<String> list = new LinkedList<String>();
		list.add(line0);
		Element result = App.shortestpath(list);
		assertNotNull(result);

		assertEquals(0,result.getCost().intValue());
		assertEquals(0,result.getPath().get(0).intValue());

	}
	
	
	@Test
	public void testShortPath4(){
		LinkedList<String> list = new LinkedList<String>();
		list.add(line4);
		list.add(line3);
		list.add(line2);
		list.add(line1);
		list.add(line0);

		Element result = App.shortestpath(list);

		assertNotNull(result);
		assertEquals(20,result.getCost().intValue());
		assertEquals(0,result.getPath().get(0).intValue());
		assertEquals(1,result.getPath().get(1).intValue());
		assertEquals(3,result.getPath().get(2).intValue());
		assertEquals(6,result.getPath().get(3).intValue());
		assertEquals(10,result.getPath().get(4).intValue());

		

	}

}
