import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fizik notu : ");
        double fizikNot = scanner.nextDouble();

        System.out.print("Matematik notu : ");
        double matematikkNot = scanner.nextDouble();

        System.out.print("Kimya notu : ");
        double kimyaNot = scanner.nextDouble();

        System.out.print("Türkçe notu : ");
        double türkceNot = scanner.nextDouble();

        System.out.print("Tarih notu : ");
        double tarihNot = scanner.nextDouble();

        System.out.print("Müzik notu : ");
        double muzikNot = scanner.nextDouble();


        double total = fizikNot + matematikkNot + kimyaNot + türkceNot + tarihNot + muzikNot;

        double ortalama = total / 6;

        System.out.println("Not ortalamanız : " + ortalama);

        String msg  = ortalama > 50 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";

        System.out.println(msg);


    }
}
