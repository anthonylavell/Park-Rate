package spot_hero.client;

import spot_hero.concrete.ParkingResult;

public class ParkingClient {

    public static void main(String[] args) {

        System.out.println(ParkingResult.getPrice("2015-07-04T05:59:00+00:00","2015-07-04T05:00:00+00:00"));

    }
}
