package DesignPattern.Strategy.Gmap;

// Client Code
public class Client {
    public static void main(String[] args) {
        MapContext mapContext = new MapContext();

        // Strategy for calculating route
        mapContext.setMapStrategy(new RouteStrategy("New York", "Los Angeles"));
        mapContext.executeStrategy();  // Output: Calculating route from New York to Los Angeles

        // Strategy for finding nearby places
        mapContext.setMapStrategy(new NearbyPlacesStrategy("restaurant", "San Francisco"));
        mapContext.executeStrategy();  // Output: Searching for nearby restaurant around San Francisco
    }
}

