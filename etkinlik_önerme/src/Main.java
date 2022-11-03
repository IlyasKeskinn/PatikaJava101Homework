import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava durumunu giriniz : ");
        int heat = scanner.nextInt();

        if (heat <=5) {
            System.out.println("Kayak yapabilirsin");
        }
        else if(heat > 5 && heat<=15){
            System.out.println("Sinemaya gidebilirsin");
        }
        else if(heat>15 && heat<=25){
            System.out.println("Piknik yapabilirsin");
        }
        else if(heat>25){
            System.out.println("Yüzmeye gidebilirsin");
        }
        else{
            System.out.println("Geçeli bir değer girin");
        }




    }
}
