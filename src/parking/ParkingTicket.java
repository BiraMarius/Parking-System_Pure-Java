package parking;

import parking.vehicle.RegistrationPlate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ParkingTicket {
    private Long id;
    private static Long lastId;
    private Long carId;
    private RegistrationPlate plate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private LocalDateTime validatedExitTime;
    private Long duration;
    private BigDecimal cost;
}
