import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : " );
        number1 = scanner.nextInt();
        System.out.print("Birinci sayıyı giriniz : " );
        number2 = scanner.nextInt();

        System.out.println(" 1-Toplama İşlemi\n 2-Çıkarma İşlemi\n 3-Çarpma İşlemi \n 4-Bölme İşlemi");
        int secim = scanner.nextInt();
        int result = 0;
        switch (secim){
            case 1 :
                result = number1 + number2;
                System.out.println("Toplam : " + result );
                break;

            case  2 :
                result = number1 - number2;
                System.out.println("Çıkarma : " + result );
                break;

            case 3 :
                result = number1 * number2;
                System.out.println("Çaprma : " + result);
                break;
            case 4 :
                result = number1 / number2;
                System.out.println("Bölme : " + result);
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin.");
        }

    }
}
