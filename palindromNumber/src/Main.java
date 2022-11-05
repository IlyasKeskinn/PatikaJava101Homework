public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrom(101));


   }

   static boolean isPalindrom(int number){

        int temp = number ;
        int lastNumber ;
        int reverseNumber = 0;
        boolean isPalindrom = false;

        while (temp !=0){

             lastNumber =temp % 10 ;

            reverseNumber = (reverseNumber*10) + lastNumber;

             temp = temp /10;

        }
       if (reverseNumber == number){
           isPalindrom = true;
       }

        return isPalindrom;
   }
}
