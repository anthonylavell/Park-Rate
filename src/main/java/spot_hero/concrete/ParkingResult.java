package spot_hero.concrete;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import spot_hero.interface_.SpotHero;

import java.time.LocalDateTime;

public class ParkingResult {
    private ParkingResult(){
    }

    public static String getPrice(String startDate, String endDate){
        SpotHero parking = getParking();
        LocalDateTime arrival = ClientInput.dateAndTime(startDate);
        LocalDateTime depart = ClientInput.dateAndTime(endDate);
        Long price = parking.getPrice(arrival,depart);
        return (price < 0) ? "invalid" : String.valueOf(price);
    }

    private static SpotHero getParking(){
        JSONObject jsonObject = new JsonFile().getJsonObject();
        JSONArray rates = (JSONArray) jsonObject.get("rates");
        return ParkingInfo.getParking(rates);
    }
}
