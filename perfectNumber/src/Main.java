import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //We create the object of the scanner class
        Scanner scanner = new Scanner(System.in);


        //get number
        System.out.println("Sayı giriniz : ");
        int number = scanner.nextInt();

        //
        int divisors = 0;
        for (int i = 1 ; i<number ; i++){
            if (number%i==0){
                divisors += i;
            }
        }
        if (divisors == number){
            System.out.println("Girilen sayı mükemmel bir sayıdır.");
        }
        else{
            System.out.println("Girilen sayı mükemmel sayı değildir.");
        }


    }
}
