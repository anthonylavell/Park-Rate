package spot_hero.interface_;

import java.time.LocalDateTime;

public interface SpotHero {
    public void setParking(Rate parkingRate);
    public Long getPrice(LocalDateTime arrival, LocalDateTime depart);
}
