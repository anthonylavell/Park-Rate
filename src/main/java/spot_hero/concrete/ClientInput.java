package spot_hero.concrete;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ClientInput {

    public static LocalDateTime dateAndTime(String str){
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH).ISO_OFFSET_DATE_TIME;

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm", Locale.ENGLISH);

        LocalDateTime date = LocalDateTime.parse(str, inputFormatter);
        return date;

    }
}
