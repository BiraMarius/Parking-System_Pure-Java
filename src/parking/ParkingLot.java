package parking;

import parking.reports.Report;
import parking.vehicle.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

abstract class ParkingLot {
    private String name;
    private Integer parkingSpaces;
    private Integer availableParkingSpaces;
    private String adress;
    private String contactPhone;
    private BigDecimal costPerHour;
    private Integer freeHours;
    private Integer exitTime;
    private ArrayList<Vehicle> vehicle = new ArrayList<>();
    private LinkedList<Report> reports = new LinkedList<>();

    //Constructors

    public ParkingLot(String name, Integer parkingSpaces, Integer availableParkingSpaces, String adress, String contactPhone, BigDecimal costPerHour, Integer freeHours, Integer exitTime) {
        this.name = name;
        this.parkingSpaces = parkingSpaces;
        this.availableParkingSpaces = availableParkingSpaces;
        this.adress = adress;
        this.contactPhone = contactPhone;
        this.costPerHour = costPerHour;
        this.freeHours = freeHours;
        this.exitTime = exitTime;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(Integer parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public Integer getAvailableParkingSpaces() {
        return availableParkingSpaces;
    }

    public void setAvailableParkingSpaces(Integer availableParkingSpaces) {
        this.availableParkingSpaces = availableParkingSpaces;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public BigDecimal getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(BigDecimal costPerHour) {
        this.costPerHour = costPerHour;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public LinkedList<Report> getReports() {
        return reports;
    }

    public void setReports(LinkedList<Report> reports) {
        this.reports = reports;
    }

    public Integer getFreeHours() {
        return freeHours;
    }

    public void setFreeHours(Integer freeHours) {
        this.freeHours = freeHours;
    }

    public Integer getExitTime() {
        return exitTime;
    }

    public void setExitTime(Integer exitTime) {
        this.exitTime = exitTime;
    }

    //Class methods

    public abstract String park(Vehicle vehicle);
    public abstract Long availableParkingPlaces();

}
