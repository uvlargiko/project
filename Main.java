
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Server server = Server.getInstance();
        Scanner in = new Scanner(System.in);

        //For Test
        server.signUpCustomer("Customer", "1", "1", "1", "1");
        server.signUpRestaurant("Restaurant", "2", "2", "1", "1", "d","1", "1", LocalTime.parse("09:00"), LocalTime.parse("21:00"), Duration.ofMinutes(60), 3);

        //Pass to Sign-in or Sign-up
        while (true) {
            System.out.println("\n# Welcome to Restaurant Booking System #\n");
            System.out.println("1. Sign-in\n");
            System.out.println("2. Sign-up\n");
            System.out.println("3. Exit\n");
            System.out.print("What action do you want to do?: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> {
                    (new SignIn()).SignIn(in);
                }
                case 2 -> {
                    (new SignUp()).SignUp(in);
                }
                case 3 -> {
                    return;
                }
                default ->
                    System.out.println("\nInvalid choice! Please try again.");
            }

        }
    }
}
