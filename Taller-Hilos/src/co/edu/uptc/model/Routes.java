package co.edu.uptc.model;

public class Routes {

	private String route;
	private int distance;
	private long value;
	
	public Routes(String route, int distance, long value) {
		super();
		this.route = route;
		this.distance = distance;
		this.value = value;
	}
	
	public Routes() {
		
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Routes [route=" + route + ", distance=" + distance + ", value=" + value + "]";
	}
	
	
	
}
