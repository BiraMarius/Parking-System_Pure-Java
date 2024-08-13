package parking;

import parking.exceptions.ParkingException;
import parking.vehicle.Vehicle;

import java.math.BigDecimal;
import java.util.List;

import static parking.ParkingTicket.getTickets;
import static parking.ParkingTicket.setTickets;


public class ParkingLotActions extends ParkingLot{


    public ParkingLotActions(String name, Integer parkingSpaces, String adress, String contactPhone, BigDecimal costPerHour, Integer freeHours, Integer exitTime) {
        super(name, parkingSpaces, parkingSpaces, adress, contactPhone, costPerHour, freeHours, exitTime);
    }

    @Override
    public ParkingTicket park(Vehicle vehicle) throws RuntimeException{
        int availableParkingSpaces = getAvailableParkingSpaces();
        if(availableParkingSpaces <= 0){
            throw new ParkingException("Out of parking spaces.");
        } else {
            List<Vehicle> vehicleList = getVehicles();
            vehicleList.add(vehicle);
            ParkingTicket parkingTicket = new ParkingTicket(vehicle.getPlate(), this);
            setAvailableParkingSpaces(--availableParkingSpaces);
            List<ParkingTicket> tickets = getTickets();
            tickets.add(parkingTicket);
            setTickets(tickets);
            return parkingTicket;
        }

    }

    @Override
    public void availableParkingPlaces() {
        System.out.println("There are "+String.valueOf(getAvailableParkingSpaces()) + " parking spaces left.");
    }


}
