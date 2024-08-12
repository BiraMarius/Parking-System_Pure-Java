package parking.vehicle;

import java.time.LocalDateTime;

public class Car extends Vehicle{
    private Long id;
    private static Long lastId=1L;
    private static Long carCounter =0L;

    //Constructors

    public Car(RegistrationPlate plate) {
        super(plate);
        carCounter++;
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
        Car.lastId = lastId;
    }

    public static Long getCarCounter() {
        return carCounter;
    }

    public static void setCarCounter(Long carCounter) {
        Car.carCounter = carCounter;
    }


    //Class methods
}
