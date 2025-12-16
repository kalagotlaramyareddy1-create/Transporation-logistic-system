public class Routes {

    private String routeId;
    private double distance;
    private double load;

    public Routes(String routeId, double distance, double load) {
        this.routeId = routeId;
        this.distance = distance;
        this.load = load;
    }

    public String getRouteId() {
        return routeId;
    }

    public double getDistance() {
        return distance;
    }

    public double getLoad() {
        return load;
    }
}
