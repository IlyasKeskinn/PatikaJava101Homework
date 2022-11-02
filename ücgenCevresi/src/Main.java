import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;
        double c, cevre, alan;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1. Kenarı Griniz : ");
        a = girdi.nextInt();

        System.out.print("2. Kenarı Griniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : "+ c);

        cevre = a + b + c;
        System.out.println("Üçgenin Çevresi : "+ cevre);

        alan = Math.sqrt((cevre/2)*(cevre/2-a)*(cevre/2-b)*(cevre/2-c));
        System.out.println("Üçgenin Alanı : "+ alan);

    }
}
