import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //We created the object of the scanner class
        Scanner scanner = new Scanner(System.in);

        //The number to query whether it is a prime number
        System.out.print("Asal sayı olup olmadığını öğrenmek isteğiniz sayıyı giriniz: ");
        int number = scanner.nextInt();

        //prime number check starts division with 2
         boolean result = isPrime(number,2);

         if (result){
             System.out.println(number + " Sayısı asaldır.");
         }
         else {
             System.out.println(number + " Sayısı asal değildir.");
         }
    }

    static boolean isPrime(int number, int i){
        if(i == number) {
            return true;
        }
        else if (number % i == 0){
            return false;
        }
        return isPrime(number,i+1);
    }
}
