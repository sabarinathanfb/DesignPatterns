package DesignPattern.Strategy.Gmap;

// Concrete Strategy: Route Calculation
public class RouteStrategy implements MapStrategy {
    private String startLocation;
    private String endLocation;

    public RouteStrategy(String startLocation, String endLocation) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    @Override
    public void execute() {
        System.out.println("Calculating route from " + startLocation + " to " + endLocation);
        // Here you would invoke the Google Maps Directions API
        // Example call: directionsService.route(request, callback);
    }
}



