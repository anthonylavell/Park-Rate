package spot_hero.concrete;

import spot_hero.interface_.Rate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class ParkingRate implements Rate {
    private List<String> days;
    private LocalTime startTime;
    private LocalTime endTime;
    private long charge;

        public ParkingRate(List<String> days, LocalTime startTime, LocalTime endTime, long charge){
        this.days = days;
        this.startTime = startTime;
        this.endTime = endTime;
        this.charge = charge;
    }

    public boolean isDay(String day){
        return days.contains(day);
    }

    public boolean isTime(LocalDateTime arrival, LocalDateTime depart){
       return ( (arrival.toLocalTime().isAfter(startTime) || arrival.toLocalTime().equals(startTime))
               && (depart.toLocalTime().isBefore(endTime) || depart.toLocalTime().equals(endTime)) ) ;
    }



    public long getRate(){
        return charge;
    }

    public List<String> getDays(){
        return days;
    }

}
