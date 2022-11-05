import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //We create the object of the scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç adet sayı kıyaslamak istediğinizi yazın : ");
        int totalNumber = scanner.nextInt();
        int[] numbers = new int[totalNumber];

        //get numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ". Sayıyı giriniz :");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        //max
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }

        //min
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }
}
