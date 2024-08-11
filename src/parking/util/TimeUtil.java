package parking.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    public static String formatTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        return localDateTime.format(formatter);
    }


}
