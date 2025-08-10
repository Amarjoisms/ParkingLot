import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    String ticketNumber;
    Vehicle vehicle;
    Parkingspot parkingspot;
    LocalDateTime entrytime;
    LocalDateTime exittime;
    int totalprice;

    public Ticket(String ticketNumber, Vehicle vehicle, Parkingspot parkingspot) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.parkingspot = parkingspot;
        this.totalprice=totalprice;

    }

    public Ticket(LocalDateTime entrytime, LocalDateTime exittime) {
        this.entrytime = entrytime;
        this.exittime = exittime;
    }

    public Ticket(String t1, Vehicle car, Parkingspot spot, LocalDateTime now, LocalDateTime localDateTime) {
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public LocalDateTime getEntrytime() {
        return entrytime;
    }

    public LocalDateTime getExittime() {
        return exittime;
    }

    public void setEntrytime(LocalDateTime entrytime) {
        this.entrytime = entrytime;
    }

    public long totalPrice(){
        long minutes = Duration.between(entrytime, exittime).toMinutes();
        if(minutes <=60){
            return 50;
        }
        else{
            long time = (minutes-60)/60;
            return Math.toIntExact(50 + (time * 20));
        }
    }
}
