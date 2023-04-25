package Java.JavaPractices;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //declaring variables
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        //scanner object
        Scanner sc = new Scanner(System.in);

        //login loop
        while (right > 0) {
            System.out.print("Kullanici Adiniz :");
            userName = sc.nextLine();
            System.out.print("Parolaniz : ");
            password = sc.nextLine();

            //if login was succesfull
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                do {
                    //main display of atm
                    System.out.println("1-Para yatirma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çikis Yap");
                    System.out.print("Lutfen yapmak istediğiniz islemi seçiniz : ");
                    select = sc.nextInt();

                    //switch case
                    switch (select) {
                        case 1:
                            System.out.print("Para miktari : ");
                            int deposit = sc.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            int withdraw = sc.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                            case 3:
                                System.out.println("Bakiyeniz : " + balance);
                                break;
                    }
                } while (select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;

            } else {
                //login failed
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }
        sc.close();
    }
}
