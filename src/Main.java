import parking.ParkingLotActions;
import parking.ParkingTicket;
import parking.vehicle.Car;
import parking.vehicle.Motorcycle;
import parking.vehicle.RegistrationPlate;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        switch (s){
//            case "1":
//                System.out.println("1");
//                break;
//            case "2":
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("Not found");
//        }


//        RegistrationPlate registrationPlate3 = new RegistrationPlate("B803MOT");
//        Motorcycle motorcycle = new Motorcycle(registrationPlate3);

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        ParkingLotActions promenadaParking = new ParkingLotActions("Promenada parking", 1,"Promenada mall", "0773737", BigDecimal.valueOf(10), 0, 5);
        RegistrationPlate registrationPlate = new RegistrationPlate("B800YAM");
        Car car = new Car(registrationPlate);
        promenadaParking.park(car);

//        RegistrationPlate registrationPlate2 = new RegistrationPlate("B802YAM");
//        Car car2 = new Car(registrationPlate2);
//        promenadaParking.park(car2);

        ParkingTicket parkingTicket = ParkingTicket.findTicket("B800YAM");
        parkingTicket.generatePhysicalTicket();
        promenadaParking.availableParkingPlaces();

        parkingTicket.validateParkingTicket();
        parkingTicket.payParkingTicket(BigDecimal.valueOf(11));

    }
}