package spot_hero.interface_;

import java.time.LocalDateTime;
import java.util.List;

public interface Rate {
    public boolean isDay(String day);
    public boolean isTime(LocalDateTime arrival, LocalDateTime depart);
    public long getRate();
    public List<String> getDays();
}
