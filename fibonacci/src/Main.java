import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonnaci eleman sayısı : ");
        int number = scanner.nextInt();

        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < number) {

            // Print the number

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;

            System.out.print(num1 + " + " + num2  + " = " + num3);
            System.out.println();

        }
    }
}
