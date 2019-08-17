package spot_hero.concrete;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingResultTest {
    private String startDate;
    private String endDate;

    @Before
    public void setUp(){
        startDate = "2015-07-01T07:00:00-05:00";
        endDate = "2015-07-01T12:00:00-05:00";
    }
    @Test
    public void getPrice(){
        String result = "1750";
        assertEquals(result, ParkingResult.getPrice(startDate,endDate));
}

}