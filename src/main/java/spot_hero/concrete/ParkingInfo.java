package spot_hero.concrete;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import spot_hero.interface_.Rate;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingInfo {

   public static Parking getParking(JSONArray rates){
        Parking parking = new Parking();
       for (int count = 0; count< rates.size(); count++) {
           JSONObject schedule = (JSONObject) rates.get(count);
           List<String> days = new ArrayList<>(Arrays.asList( String.valueOf( schedule.get("days")).split(",")   ));
           String time = (String) schedule.get("times");
           String [] times = time.split("-");
           //String tz = (String) schedule.get("tz");
           Long price = (Long) schedule.get("price");

           String startTime = new StringBuilder(times[0]).insert(2,':').toString();
           String endTime = new StringBuilder(times[1]).insert(2,':').toString();
           LocalTime start  = LocalTime.parse(startTime);
           LocalTime end  = LocalTime.parse(endTime);
           Rate parkingRate = new ParkingRate(days,start,end,price);
           parking.setParking(parkingRate);
       }
       return parking;
   }
}
