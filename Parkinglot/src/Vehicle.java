abstract class Vehicle {
    String numberPlate;
    Vehicletype vehicleType;

    public Vehicle(String numberPlate, Vehicletype vehicleType) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }

    public String getNumplate() {
        return numberPlate;
    }

    public Vehicletype getVehicletype() {
        return vehicleType;
    }

}
