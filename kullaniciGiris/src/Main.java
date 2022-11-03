import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName;
        String password;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Kullanıcı adınızı girin : ");
        userName = scanner.nextLine();

        System.out.print("Şifrenizi girin : ");
        password = scanner.nextLine();

        if (userName.equals("İlyas") && password.equals("İlyas123")) {
            System.out.println("Sisteme başarılı bir şekilde giriş yaptınız.");
        } else {
            System.out.println("Hatalı şifre veya kullanıcı adı!");
            System.out.println("1-Yeni Şifre Oluştur \n2-Hayır");
            int secim = scanner.nextInt();
            scanner.nextLine();

            if (secim == 1) {
                String newPassword;
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPassword = scanner.nextLine();
                if (newPassword.equals("İlyas123")) {
                    System.out.println("Daha önce kullanılmış şifreyi tekrardan alamazsınız !");
                } else {
                    System.out.println("Şifre başarılı bir şekilde değiştirildi.");
                }

            } else {
                System.out.println("Program bitti!");
            }
        }

    }
}
