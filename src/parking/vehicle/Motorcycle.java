package parking.vehicle;

import java.time.LocalDateTime;

public class Motorcycle extends Vehicle{
    private Long id;
    private static Long lastId=1L;
    private static Long motorcycleCounter =0L;

    //Constructors

    public Motorcycle(RegistrationPlate registrationPlate) {
        super(registrationPlate);
        motorcycleCounter++;
    }

    //Getter and Setters

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public static Long getLastId() {
        return lastId;
    }

    public static void setLastId(Long lastId) {
        Motorcycle.lastId = lastId;
    }

    public static Long getMotorcycleCounter() {
        return motorcycleCounter;
    }

    public static void setMotorcycleCounter(Long motorcycleCounter) {
        Motorcycle.motorcycleCounter = motorcycleCounter;
    }


    //Class methods
}
