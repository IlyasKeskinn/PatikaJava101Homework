import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N Sayısı :");
        int N = input.nextInt();

        pattern(N,N,0);

    }

    static void pattern(int number, int tempNumber, int n) {

        if (number > 0 && n == 0) {
            System.out.print(number + " ");
            number -= 5;
            pattern(number, tempNumber, 0);

        } else if (number <= 0) {
            System.out.print(number + " ");
            number += 5;
            pattern(number, tempNumber, 1);
        } else if (number > 0 && number <= tempNumber && n == 1) {
            System.out.print(number + " ");
            number += 5;
            pattern(number, tempNumber, 1);
        }
    }
}
