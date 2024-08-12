package parking;

import parking.vehicle.Vehicle;

import java.math.BigDecimal;
import java.util.List;

public class ParkingLotActions extends ParkingLot{


    public ParkingLotActions(String name, Integer parkingSpaces, String adress, String contactPhone, BigDecimal costPerHour, Integer freeHours, Integer exitTime) {
        super(name, parkingSpaces, parkingSpaces, adress, contactPhone, costPerHour, freeHours, exitTime);
    }

    @Override
    public ParkingTicket park(Vehicle vehicle) {
        List<Vehicle> vehicleList = getVehicles();
        vehicleList.add(vehicle);
        ParkingTicket parkingTicket = new ParkingTicket(vehicle.getPlate());
        return parkingTicket;
    }

    @Override
    public Long availableParkingPlaces() {
        return null;
    }


}
