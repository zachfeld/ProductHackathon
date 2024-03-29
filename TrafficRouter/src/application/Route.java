package application;

public class Route {

	private Intersection start;
	private Intersection end;
	private double distance;
	private double optimalSpeed;
	private double traffic;
	
	public Route(Intersection start, Intersection end, double distance, double optimalSpeed){
		this.start = start;
		this.end = end;
		this.distance = distance;
		this.optimalSpeed = optimalSpeed;
		this.traffic = 0.0;
	}

	public double currentSpeed(){
		return optimalSpeed * (1 - traffic);
	}
	
	public double getTraffic() {
		return traffic;
	}

	public void setTraffic(double traffic) {
		this.traffic = traffic;
	}

	public Intersection getStart() {
		return start;
	}

	public Intersection getEnd() {
		return end;
	}

	public double getDistance() {
		return distance;
	}

	public double getOptimalSpeed() {
		return optimalSpeed;
	}

	@Override
	public String toString() {
		return "Route [start=" + start.getName() + ", end=" + end.getName() + ", distance=" + distance + ", optimalSpeed=" + optimalSpeed
				+ ", traffic=" + traffic + "]";
	}
	
	
}
