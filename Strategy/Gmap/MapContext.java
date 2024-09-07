package DesignPattern.Strategy.Gmap;

// Context Class
public class MapContext {
    private MapStrategy mapStrategy;

    public void setMapStrategy(MapStrategy mapStrategy) {
        this.mapStrategy = mapStrategy;
    }

    public void executeStrategy() {
        mapStrategy.execute();
    }
}

