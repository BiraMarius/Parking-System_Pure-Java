package parking.vehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vehicle {
    private Long id;
    private static Long lastId;
    private static Long counter;
    private RegistrationPlate plate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Long duration;
    private BigDecimal cost;



}
