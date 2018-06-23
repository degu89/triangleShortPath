package suprnation.enrico.deguidi.TriangleShortestPath;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.text.AbstractDocument.ElementEdit;

import org.junit.Test;

public class TestPrint {
	@Test
	public void testShortPath1(){
		Element element = new Element();
		element.setCost(12003);
		element.setPath(new ArrayList<Integer>());
		element.getPath().add(1);
		element.getPath().add(2);
		element.getPath().add(3000);
		element.getPath().add(4000);
		element.getPath().add(5000);
		assertEquals("Minimal path is: 1 + 2 + 3000 + 4000 + 5000 = 12003",App.printResult(element));

	}
}
