import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        int taban = scanner.nextInt();

        System.out.print("Üssü yazınız: ");
        int us = scanner.nextInt();

        int sonuc = 1;

        for (int i = 1 ; i<=us ; i++){
            sonuc *=taban;
        }

        System.out.println("Sonuç " + sonuc);
    }
}
