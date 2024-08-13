package parking.util;

import parking.ParkingTicket;

import java.math.BigDecimal;

import static parking.util.TimeUtil.calculateDuration;
import static parking.util.TimeUtil.calculateHoursToPay;

public class PaymentUtil {

    public static void calculatePrice(ParkingTicket parkingTicket){
        BigDecimal hoursToPay = BigDecimal.valueOf(calculateHoursToPay(parkingTicket,parkingTicket.getParkingLot()));
        if(calculateHoursToPay(parkingTicket,parkingTicket.getParkingLot())<=0){
            System.out.println("Ticket validated. Free parking. ");
            System.out.println("Drive safe!");
            parkingTicket.setCost(BigDecimal.valueOf(0));
            parkingTicket.setDuration(calculateDuration(parkingTicket));
        } else {
            BigDecimal cost = hoursToPay.multiply(parkingTicket.getParkingLot().getCostPerHour());
            parkingTicket.setCost(cost);
            System.out.println("You have to pay for parking: "+ cost);
        }
    }

}
