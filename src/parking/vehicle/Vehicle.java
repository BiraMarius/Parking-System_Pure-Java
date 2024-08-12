package parking.vehicle;

public class Vehicle {
    private Long id;
    private static Long lastId=1L;
    private static Long vehicleCounter =0L;
    private RegistrationPlate plate;

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


    //Class methods

    public void showVehicle(Vehicle vehicle){
        System.out.println("##########   VEHICLE   ##########");
        System.out.println("# ID: "+ String.valueOf(vehicle.getId()));
        System.out.println("# Last ID: "+String.valueOf(getLastId()));
        System.out.println("# Counter: "+ String.valueOf(getVehicleCounter()));
        System.out.println("# PLATE: "+vehicle.getPlate().getRegistrationNumber());
        System.out.println("#################################");
    }

    public void showVehicle(){
        System.out.println("##########   VEHICLE   ##########");
        System.out.println("# ID: "+ String.valueOf(getId()));
        System.out.println("# Last ID: "+String.valueOf(getLastId()));
        System.out.println("# Counter: "+ String.valueOf(vehicleCounter));
        System.out.println("# PLATE: "+plate.getRegistrationNumber());
        System.out.println("#################################");
    }


}
