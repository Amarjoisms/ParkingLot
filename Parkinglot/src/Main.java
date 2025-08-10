import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("123456",Vehicletype.CAR);
        Parkingspot spot = new Cartype("B1",true,Parkingspottype.CARTYPE);
        Parkingfloor floor = new Parkingfloor("F1", List.of(spot));
        Ticket ticket = new Ticket("T1", car, spot, LocalDateTime.now(),LocalDateTime.now().plusHours(2).plusMinutes(15));
        System.out.println("Ticket issued: " + ticket.getTicketNumber()+ " " +ticket.getEntrytime());

        if(spot.canVehicleFit(car)) {
            spot.assignVehicle(car);
        }
        System.out.println("Vehicle parked in "+ spot.getSpotId());
        ticket.totalPrice();
        System.out.println("Total cost: ₹" + ticket.getTotalprice());
    }
}