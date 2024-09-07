package DesignPattern.Strategy.Gmap;

public class NearbyPlacesStrategy implements MapStrategy {
    private String placeType;
    private String location;

    public NearbyPlacesStrategy(String placeType, String location) {
        this.placeType = placeType;
        this.location = location;
    }

    @Override
    public void execute() {
        System.out.println("Searching for nearby " + placeType + " around " + location);
        // Here you would invoke the Google Maps Places API
        // Example call: placesService.nearbySearch(request, callback);
    }
}
