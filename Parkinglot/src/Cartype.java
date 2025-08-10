class Cartype extends Parkingspot {
    public Cartype(String spotId, boolean isAvailable,Parkingspottype parkingSpotType) {
        super(spotId, isAvailable, parkingSpotType);
    }

    @Override
    public boolean canVehicleFit(Vehicle vehicle){
        return vehicle.getVehicletype() == Vehicletype.CAR;
    }
}
