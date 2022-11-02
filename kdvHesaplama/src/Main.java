import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fiyat giriniz : ");
        int fiyat = scanner.nextInt();
        
        float kdvOranı = 0f;
        
        if (fiyat>0 || fiyat<1000){
            kdvOranı = 0.18f;
        }
        else if(fiyat>1000) {
            kdvOranı = 0.08f;
        }

        float kdvTutar = fiyat * kdvOranı;
        float kdvliFiyat = kdvTutar + fiyat;

        System.out.println("KDV'siz Fiyat : " + fiyat );
        System.out.println("KDV'li Fiyat : " + kdvliFiyat );
        System.out.println("KDV Tutarı : " + kdvTutar );


    }
}
