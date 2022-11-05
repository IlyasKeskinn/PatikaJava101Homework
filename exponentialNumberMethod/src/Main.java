import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //We created the object of the scanner class
        Scanner scanner = new Scanner(System.in);


        //Getting base value from user
        System.out.println("Tabanı değerini yazınız.");
        int number = scanner.nextInt();

        //Getting power value from user
        System.out.println("Üs değerini yazınız.");
        int power = scanner.nextInt();


        int result = expNumber(power,number );

        System.out.println("Sonuç : " + result);
    }

    static int expNumber(int power, int number) {
        if (power <= 0) {
            return 1;
        } else {
            return  number * expNumber(--power , number);
        }
    }
}
