import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //we include scanner to get data input from user
        Scanner scanner = new Scanner(System.in);

        //We ask the user for the year of birth
        System.out.print("Please enter your year of birth : ");
        int birthYear = scanner.nextInt();

        //to find the remainder when the year of birth is divided by 12
        int remain = birthYear % 12;

        //return result with switch case based on remainder
        switch (remain) {
            case 0:
                System.out.println("Your zodiac sign is monkey");
                break;
            case 1:
                System.out.println("Your zodiac sign is cock");
                break;
            case 2:
                System.out.println("Your zodiac sign is dog");
                break;
            case 3:
                System.out.println("Your zodiac sign is pig");
                break;
            case 4:
                System.out.println("Your zodiac sign is mouse");
                break;
            case 5:
                System.out.println("Your zodiac sign is bull");
                break;
            case 6:
                System.out.println("Your zodiac sign is tiger");
                break;
            case 7:
                System.out.println("Your zodiac sign is rabbit");
                break;
            case 8:
                System.out.println("Your zodiac sign is dragon");
                break;
            case 9:
                System.out.println("Your zodiac sign is snake");
                break;
            case 10:
                System.out.println("Your zodiac sign is horse");
                break;
            case 11:
                System.out.println("Your zodiac sign is sheep");
                break;

            default:
                System.out.println("Not found");

        }

    }
}
