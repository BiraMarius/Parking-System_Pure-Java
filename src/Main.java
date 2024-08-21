import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            default:
                System.out.println("Not found");
        }

    }
}