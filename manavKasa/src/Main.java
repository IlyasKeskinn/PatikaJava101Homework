import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlicanKgFiyat = 5;

        System.out.print("Armut kaç kilo ? ");
        int armutKilo = scanner.nextInt();

        System.out.print("Elma kaç kilo ? ");
        int elmaKilo = scanner.nextInt();

        System.out.print("Domates kaç kilo ? ");
        int domatesKilo = scanner.nextInt();

        System.out.print("Muz kaç kilo ? ");
        int muzKilo = scanner.nextInt();

        System.out.print("Patlıcan kaç kilo ? ");
        int patlicanKilo = scanner.nextInt();


        double armutToplam  = armutKgFiyat * armutKilo;

        double elmaToplam  = elmaKgFiyat * elmaKilo;

        double domatesToplam  = domatesKgFiyat * domatesKilo;

        double muzToplam  = muzKgFiyat * muzKilo;

        double patlicanToplam  = patlicanKgFiyat * patlicanKilo;

        double total = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam ;



        System.out.println("Toplam : " + total);

    }
}
