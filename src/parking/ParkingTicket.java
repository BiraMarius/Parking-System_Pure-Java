package parking;

import parking.vehicle.RegistrationPlate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static parking.util.TimeUtil.formatTime;

public class ParkingTicket {
    private Long id;
    private static Long lastId=1L;
    private Long carId;
    private RegistrationPlate plate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private LocalDateTime validatedExitTime;
    private Long duration;
    private BigDecimal cost;

    //Constructors

    public ParkingTicket(RegistrationPlate plate) {
        this.plate = plate;
        entryTime=LocalDateTime.now();
        id=lastId;
        lastId++;
        generatePhysicalTicket();
    }


    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long getLastId() {
        return lastId;
    }

    public static void setLastId(Long lastId) {
        ParkingTicket.lastId = lastId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public RegistrationPlate getPlate() {
        return plate;
    }

    public void setPlate(RegistrationPlate plate) {
        this.plate = plate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public LocalDateTime getValidatedExitTime() {
        return validatedExitTime;
    }

    public void setValidatedExitTime(LocalDateTime validatedExitTime) {
        this.validatedExitTime = validatedExitTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }


    //Class methods

    public void generatePhysicalTicket(){
        System.out.println("##########   PARKING TICKET   ##########");
        System.out.println("#   Registration plate: "+plate.getRegistrationNumber());
        System.out.println("#   You parked you vehicle at: "+ formatTime(entryTime));
        System.out.println("# ");
        System.out.println("#        Thank you for choosing us!          ");
        System.out.println("# ");
        System.out.println("#  YOUR TICKET ID IS: "+String.valueOf(id));
        System.out.println("#######################################");
    }
}
