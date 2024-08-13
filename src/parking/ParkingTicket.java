package parking;

import parking.exceptions.ParkingTicketException;
import parking.vehicle.RegistrationPlate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static parking.util.PaymentUtil.calculatePrice;
import static parking.util.TimeUtil.*;

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
    private ParkingLotActions parkingLot;
    private static List<ParkingTicket> tickets=new ArrayList<>();

    //Constructors

    public ParkingTicket(RegistrationPlate plate, ParkingLotActions parkingLotActions) {
        this.plate = plate;
        this.parkingLot= parkingLotActions;
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

    public ParkingLotActions getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLotActions parkingLot) {
        this.parkingLot = parkingLot;
    }

    public static List<ParkingTicket> getTickets() {
        return tickets;
    }

    public static void setTickets(List<ParkingTicket> tickets) {
        ParkingTicket.tickets = tickets;
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

    public void validateParkingTicket(){
        calculatePrice(this);
    }

    public void payParkingTicket(BigDecimal payment){
        if(payment.compareTo(cost) < 0){
            System.out.println("Insufficient funds!");
        } else if (payment.compareTo(cost) > 0){
            System.out.println("Payment accepted!");
            System.out.println("Your payment is higher, there is your change: "+String.valueOf(payment.subtract(cost)));
            System.out.println("Have a nice day! Drive safe!");
            this.setDuration(calculateDuration(this));
        } else if(payment.compareTo(cost)==0){
            System.out.println("Payment accepted!");
            System.out.println("Have a nice day! Drive safe!");
            this.setDuration(calculateDuration(this));
        }
    }

    public static ParkingTicket findTicket(String registrationPlate){
        Optional<ParkingTicket> parkingTicket = tickets.stream()
                .filter(ticket -> ticket.plate.getRegistrationNumber().equals(registrationPlate))
                .findFirst();
        if(parkingTicket.isPresent()){
            return parkingTicket.get();
        } else {
            throw new ParkingTicketException("Ticket not found.");
        }
    }
}
