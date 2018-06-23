package suprnation.enrico.deguidi.TriangleShortestPath;

import java.util.List;

public class Element {
	private Integer cost;
	private List<Integer> path;
	
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public List<Integer> getPath() {
		return path;
	}
	public void setPath(List<Integer> path) {
		this.path = path;
	}
	
	
}
