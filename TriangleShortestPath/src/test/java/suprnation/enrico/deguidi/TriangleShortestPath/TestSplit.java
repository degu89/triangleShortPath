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

}
