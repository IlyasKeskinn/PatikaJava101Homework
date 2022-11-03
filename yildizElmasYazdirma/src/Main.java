import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {

            for (int k = 0; k < number - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= number; i++) {
            for (int k = 0 ; k<=i+1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j<(2*number-1 -(2*(i+1))) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
