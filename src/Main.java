import parking.vehicle.Car;
import parking.vehicle.Motorcycle;
import parking.vehicle.RegistrationPlate;

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
        RegistrationPlate registrationPlate = new RegistrationPlate("B800YAM");
        Car car = new Car(registrationPlate);
        //car.showVehicle(car);
        //car.showVehicle();
        car.showVehicle();
        registrationPlate.registrationPlateDetails();

        RegistrationPlate registrationPlate2 = new RegistrationPlate("MAIGR01");
        Car car2 = new Car(registrationPlate2);
        //car2.showVehicle(car2);
        //car2.showVehicle();
        car2.showVehicle();
        registrationPlate2.registrationPlateDetails();



        RegistrationPlate registrationPlate3 = new RegistrationPlate("B803MOT");
        Motorcycle motorcycle = new Motorcycle(registrationPlate3);
        //motorcycle.showVehicle();


        //car.showVehicle(car2);
    }
}