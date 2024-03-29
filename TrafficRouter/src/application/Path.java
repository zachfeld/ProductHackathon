package application;

import java.util.ArrayList;
import java.util.Arrays;

public class Path {
	
	private Route[] routes;
	
	public Path(Route[] routes){
		this.routes = routes;
	}
	
	public double getOptimalSpeed(){
		double time = 0.0;
		for (Route route: routes){
			time += route.getOptimalSpeed();
		}
		return time;
	}
	
	public double getCurrentSpeed(){
		double currentSpeed = 0.0;
		for (Route route: routes){
			currentSpeed += route.currentSpeed();
		}
		return currentSpeed;
	}
	
	public double getDistance(){
		double distance = 0.0;
		for (Route route: routes){
			distance += route.getDistance();
		}
		return distance;
	}
	
	public ArrayList<Intersection> getIntersections(){
		ArrayList<Intersection> intersections = new ArrayList<Intersection>();
		for (Route route: routes){
			intersections.add(route.getStart());
		}
		// add end intersection of last route
		intersections.add(routes[routes.length-1].getEnd());
		return intersections;
	}
	
	public ArrayList<Stoplight[]> getStopLights(){
		ArrayList<Intersection> intersections = this.getIntersections();
		ArrayList<Stoplight[]> stoplights = new ArrayList<Stoplight[]>();
		
		for (Intersection intersection: intersections){
			stoplights.add(intersection.getStoplights());
		}
		return stoplights;
	}

	@Override
	public String toString() {
		return "Path [routes=" + Arrays.toString(routes) + "]";
	}
	

}
