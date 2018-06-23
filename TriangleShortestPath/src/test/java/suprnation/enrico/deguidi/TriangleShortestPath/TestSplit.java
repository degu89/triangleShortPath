package suprnation.enrico.deguidi.TriangleShortestPath;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
public class TestSplit {
	
	final static String input= "1 2 3 4 5 6";
	@Test
	public void testSplitSize(){
		List<Integer> list = App.splitText("1 2 3 4 5 6");
		assertEquals(6,list.size());
	}
	@Test
	public void testSplitElemet(){
		List<Integer> list = App.splitText("1 2 3 4 5 6");
		assertEquals(1,list.get(0).intValue());
		assertEquals(2,list.get(1).intValue());
		assertEquals(3,list.get(2).intValue());
		assertEquals(4,list.get(3).intValue());
		assertEquals(5,list.get(4).intValue());
		assertEquals(6,list.get(5).intValue());

	}

}
