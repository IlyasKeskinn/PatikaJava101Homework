import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //We create the object of the scanner class
        Scanner scanner = new Scanner(System.in);


        System.out.println("Basamak sayısı giriniz : ");
        int step = scanner.nextInt();

        for (int i = 0 ; i<step ; i++){
            for (int k = 0; k<=i ;k++){
                System.out.print(" ");
            }
            for (int j =(2*step-1)  ; j>= (2*i+1)  ;j--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
