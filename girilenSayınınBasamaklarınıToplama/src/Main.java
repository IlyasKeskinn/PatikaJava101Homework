import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 4 basamklı bir sayı giriniz : ");

        int number = scanner.nextInt();

        int basamakBinler = number / 1000 ;

        int basamakYuzler = (number - basamakBinler*1000)  / 100;

        int basamakOnlar= (number - basamakYuzler*100 - basamakBinler *1000)/10;

        int basamakBirler = number % 10 ;

        int basamaklarToplam = basamakBirler + basamakOnlar + basamakYuzler + basamakBinler;

        System.out.println("Basamaklar toplamı " + basamaklarToplam);


    }
}
