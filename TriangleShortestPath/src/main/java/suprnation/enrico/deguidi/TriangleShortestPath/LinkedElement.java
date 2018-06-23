package suprnation.enrico.deguidi.TriangleShortestPath;

import java.util.List;

public class LinkedElement {
	private Integer cost;
	private Integer value;

	private LinkedElement previous;
	
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public LinkedElement getPrevious() {
		return previous;
	}
	public void setPrevious(LinkedElement previous) {
		this.previous = previous;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
