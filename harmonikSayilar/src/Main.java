import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int num;
        double result = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Please: ");
        num = input.nextInt();

        System.out.println("The harmonic series is: ");

        // printing the harmonic series till num value
        // using while loop
        while (num > 0) {

            // calculating harmonic values
            result = result + (double) 1 / num;

            // after calculating harmonic value
            // decrementing num by 1 which means the common
            // difference is 1
            num--;
            System.out.println(result + ", ");


        }
    }
}
