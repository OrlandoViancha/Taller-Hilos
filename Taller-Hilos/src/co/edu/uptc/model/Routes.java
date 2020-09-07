package co.edu.uptc.model;

public class Routes {

	private String target;
    private int distance;
    private long value;

    public Routes(String target, int distance, long value) {
        this.target = target;
        this.distance = distance;
        this.value = value;
    }

    public Routes() {
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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
        return "target{" + "target=" + target + ", distance=" + distance + ", value=" + value + '}';
    }
	
	
	
}
