abstract class Parkingspot {
    String spotId;
    boolean isAvailable;
    Parkingspottype parkingSpotType;
    Vehicle vehicle;

    public Parkingspot(String spotId, boolean isAvailable, Parkingspottype parkingSpotType) {
        this.spotId = spotId;
        this.isAvailable = isAvailable;
        this.parkingSpotType = parkingSpotType;
    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Parkingspottype getParkingSpottype() {
        return parkingSpotType;
    }

    public abstract boolean canVehicleFit(Vehicle vehicle);

    public boolean assignVehicle(Vehicle vehicle){
        if(!isAvailable) {
            return false;
        }
            this.isAvailable= false;
            this.vehicle = vehicle;
            return true;
    }

    public void removeVehicle(Vehicle vehicle){
        this.isAvailable = true;
        this.vehicle = null;

    }

}
