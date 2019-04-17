package application;

import java.util.Arrays;

public class Intersection {

	private String name;
	private Intersection[] adjacents;
	private Stoplight[] stoplights;
	
	public Intersection(String name, Intersection[] adjacents, Stoplight[] stoplights){
		this.name = name;
		this.adjacents = adjacents;
		this.stoplights = stoplights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Intersection[] getAdjacents() {
		return adjacents;
	}

	public void setAdjacents(Intersection[] adjacents) {
		this.adjacents = adjacents;
	}

	public Stoplight[] getStoplights() {
		return stoplights;
	}

	public void setStoplights(Stoplight[] stoplights) {
		this.stoplights = stoplights;
	}

	@Override
	public String toString() {
		return "Intersection [name=" + name + ", adjacents=" + Arrays.toString(adjacents) + ", stoplights="
				+ Arrays.toString(stoplights) + "]";
	}
	
	
}
