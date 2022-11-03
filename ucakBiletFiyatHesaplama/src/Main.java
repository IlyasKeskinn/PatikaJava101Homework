import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //In order to receive data input from the user, we include the scanner class in the project.
        Scanner scanner = new Scanner(System.in);


        //we get data input from user
        System.out.print("Lütfen mesafeyi KM cinsinden giriniz : ");
        int km = scanner.nextInt();
        System.out.print("Lütfen yaşınızı giriniz : ");
        int age = scanner.nextInt();
        double pricePerKm = 0.10;

        double ticketPrice = km* pricePerKm ;


        //Ticket discounts are made according to the entered age.

        if (age <12){
            ticketPrice = ticketPrice -(ticketPrice* 0.5);
        }
        else if (age>12 && age<=24){
            ticketPrice = ticketPrice-(ticketPrice * 0.1);
        }
        else if (age>65){
            ticketPrice = ticketPrice-(ticketPrice * 0.3);
        }

        //We ask the user for the type of trip
        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş ");
        scanner.nextLine();
        int choose = scanner.nextInt();


        //one way discount is not applied, round trip discount is applied
        if (km<0||age<0){
            System.out.println("Hatalı  değer girdiniz. Lütfen pozitif bir değer girin!");
        }
        if (choose == 1 ) {
            System.out.println("Tek yön uçak biletlerinde indirim uylanmamaktadır.");
        }
        //the value is multiplied by 2 since it is a round trip and a return
        else if(choose == 2 ){
            ticketPrice = (ticketPrice-(ticketPrice * 0.2))*2;
        }



        System.out.println("Bilet Fiyatı : " + ticketPrice);
    }
}
