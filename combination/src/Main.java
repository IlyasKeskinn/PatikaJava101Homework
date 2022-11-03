import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("C(n,r) bicimindeki n degerini giriniz: ");
        int n = scanner.nextInt();
        System.out.println("C(n,r) bicimindeki r degerini giriniz: ");
        int r = scanner.nextInt();


        int nFaktoriyel = 1;

        for (int i =1 ; i<=n ; i++){
            nFaktoriyel *= i;
        }


        int rFaktoriyel = 1;

        for (int i =1 ; i<=r ; i++){
            rFaktoriyel *= i;
        }

        int n_fark_r = n-r;

        int n_fark_rFaktoriyel = 1;

        for (int i =1 ; i<=n_fark_r ; i++){
            n_fark_rFaktoriyel *= i;
        }

        int combination = nFaktoriyel / (rFaktoriyel - n_fark_rFaktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + combination);

    }
}
