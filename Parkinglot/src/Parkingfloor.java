import java.util.List;

public class Parkingfloor {
    String FloorNumber;
    List<Parkingspot> spot;

    public Parkingfloor(String floorNumber, List<Parkingspot> spot) {
        FloorNumber = floorNumber;
        this.spot = spot;
    }

    public String getFloorNumber() {
        return FloorNumber;
    }

    public List<Parkingspot> getSpot() {
        return spot;
    }
}
