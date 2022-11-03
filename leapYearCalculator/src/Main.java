import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //we include scanner to get data input from user
        Scanner scanner = new Scanner(System.in);

        //We ask the user to enter the year
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();

        
        if (year%100==0){
            if (year%400 ==0){
                System.out.println("Entered year is a leap year");
            }
            else{
                System.out.println("Entered year isn't a leap year");
            }
        }
        else if(year % 4 ==0 ){
            System.out.println("Entered year is a leap year");
        }
        else {
            System.out.println("Entered year isn't a leap year");
        }


    }
}
