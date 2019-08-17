package spot_hero.concrete;

import spot_hero.interface_.Rate;
import spot_hero.interface_.SpotHero;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Parking implements SpotHero {
    private  Map<Integer, Rate> parkingMap;
    int index = 0;

    public Parking(){
        parkingMap = new HashMap<>();
    }

    public void setParking(Rate parkingRate){
        parkingMap.put(index, parkingRate);
        index++;

    }

    public Long getPrice(LocalDateTime arrival, LocalDateTime depart){
        return (arrival.toLocalTime().equals(depart.toLocalTime()) || arrival.toLocalTime().isAfter(depart.toLocalTime()))? -1 : schedulingPark(arrival,depart);
    }

    private long schedulingPark(LocalDateTime arrival, LocalDateTime depart ){
        String day = String.valueOf(arrival.getDayOfWeek()).toLowerCase();
        day = day.substring(0,3);
        //System.out.println(day);
        for(int count =0; count < parkingMap.size(); count++){
            if( parkingMap.get(count).isDay(day) && parkingMap.get(count).isTime(arrival,depart)){
                //System.out.println("ParkingRate: " + parkingMap.get(count).getRate());
                return parkingMap.get(count).getRate();
            }
        }
         return -1;
    }

    /*public void displayMap(){
        parkingMap.forEach( (k,v) -> System.out.println((k + ":" + "Days "+ v.getDays() + " ParkingRate " + v.getRate() ) ) );
    }*/
}
