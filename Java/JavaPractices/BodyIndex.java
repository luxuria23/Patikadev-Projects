package Java.JavaPractices;


import java.util.Scanner;
public class BodyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz (metre cinsinden)");
        double boy = sc.nextDouble();
        System.out.println("Kilonuzu giriniz");
        double kilo = sc.nextDouble();
        double endeksin = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + Math.floor(endeksin));
        sc.close();
    }
}
