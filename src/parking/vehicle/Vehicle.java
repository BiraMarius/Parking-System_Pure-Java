package parking.vehicle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static parking.util.TimeUtil.formatTime;

public class Vehicle {
    private Long id;
    private static Long lastId=1L;
    private static Long vehicleCounter =0L;
    private RegistrationPlate plate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Long duration;
    private BigDecimal cost;

    //Constructors

    public Vehicle(RegistrationPlate plate) {
        this.plate = plate;
        this.setId(lastId);
        vehicleCounter++;
        lastId++;
    }

    //Getter and Setters

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
        Vehicle.lastId = lastId;
    }

    public static Long getVehicleCounter() {
        return vehicleCounter;
    }

    public static void setVehicleCounter(Long vehicleCounter) {
        Vehicle.vehicleCounter = vehicleCounter;
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

    public void showVehicle(Vehicle vehicle){
        System.out.println("##########   VEHICLE   ##########");
        System.out.println("# ID: "+ String.valueOf(vehicle.getId()));
        System.out.println("# Last ID: "+String.valueOf(getLastId()));
        System.out.println("# Counter: "+ String.valueOf(getVehicleCounter()));
        System.out.println("# PLATE: "+vehicle.getPlate().getRegistrationNumber());
        System.out.print("# Entry Time: ");
        if(entryTime==null){
            System.out.println("null");
        } else {
            System.out.println(formatTime(vehicle.getEntryTime()));
        }
        System.out.print("# Exit Time: ");
                if(vehicle.getExitTime()==null){
                    System.out.println("null");
                } else {
                    System.out.println(formatTime(vehicle.getExitTime()));
                }
        System.out.println("# Duration: "+String.valueOf(vehicle.getDuration()));
        System.out.println("# Cost: "+String.valueOf(vehicle.getCost()));
        System.out.println("#################################");
    }

    public void showVehicle(){
        System.out.println("##########   VEHICLE   ##########");
        System.out.println("# ID: "+ String.valueOf(getId()));
        System.out.println("# Last ID: "+String.valueOf(getLastId()));
        System.out.println("# Counter: "+ String.valueOf(vehicleCounter));
        System.out.println("# PLATE: "+plate.getRegistrationNumber());
        System.out.print("# Entry Time: ");
        if(entryTime==null){
            System.out.println("null");
        } else {
            System.out.println(formatTime(entryTime));
        }
        System.out.print("# Exit Time: ");
        if(exitTime==null){
            System.out.println("null");
        } else {
            System.out.println(formatTime(exitTime));
        }
        System.out.println("# Duration: "+String.valueOf(duration));
        System.out.println("# Cost: "+String.valueOf(cost));
        System.out.println("#################################");
    }

}
