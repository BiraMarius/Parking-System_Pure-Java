package parking;

import parking.vehicle.Vehicle;

import java.math.BigDecimal;

public class ParkingLotActions extends ParkingLot{


    public ParkingLotActions(String name, Integer parkingSpaces, Integer availableParkingSpaces, String adress, String contactPhone, BigDecimal costPerHour, Integer freeHours, Integer exitTime) {
        super(name, parkingSpaces, availableParkingSpaces, adress, contactPhone, costPerHour, freeHours, exitTime);
    }

    @Override
    public String park(Vehicle vehicle) {
        return null;
    }

    @Override
    public Long availableParkingPlaces() {
        return null;
    }


}
