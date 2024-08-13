package parking.util;

import parking.ParkingLotActions;
import parking.ParkingTicket;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    public static String formatTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        return localDateTime.format(formatter);
    }

    public static Long calculateDuration(ParkingTicket parkingTicket){
        Duration durationOfParking = Duration.between(parkingTicket.getEntryTime(), LocalDateTime.now());
        return (long) durationOfParking.toHours();
    }

    public static Long calculateHoursToPay(ParkingTicket parkingTicket, ParkingLotActions parkingLotActions){
        long durationOfParking = calculateDuration(parkingTicket);
        long hoursToPay = durationOfParking - parkingLotActions.getFreeHours();
        if(hoursToPay < 0){
            return 0L;
        } else if(hoursToPay == 0){
            return ++hoursToPay;
        } else {
            return hoursToPay;
        }

    }

}
