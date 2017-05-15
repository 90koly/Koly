import java.util.Scanner;

public class Koly {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner pbd = new Scanner(System.in);

        // What year are you born in (yrborn)
        System.out.println("What year are you born in?: ");
        int yrborn = input.nextInt();

        int currentyr = 2017;

        // Have you passed your birthday? (passbd)
        System.out.println("Have you passed your birthday? (y/n): ");
        String passbd = pbd.nextLine();

        // If pass birthday, add an increment (incrementbd)
        int incrementbd = yrborn ++;

        // Calculations for pass birthday (calcpbd)
        int calcpbd = currentyr - incrementbd;

        // Calculation for havent pass birthday (calcbd)
        int calcbd = currentyr - yrborn;

        switch (passbd){
            case("y"):
                System.out.println("You are now: " + calcpbd + " Years Old!");
                break;

            case("n"):
                System.out.println("You are now: " + calcbd + " Years Old!");
                break;

                default:
                    System.out.println("Program did not receive the correct response, Restart the program!");
        }
    }
}
