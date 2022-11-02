import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz(1,75) : ");
        double boy  = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo  = scanner.nextInt();

        double kitleIndeksi = kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz : " + kitleIndeksi);
    }
}
