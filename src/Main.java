import java.util.Scanner;

/*Kilo (kg) / Boy(m) * Boy(m)
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        Lütfen kilonuzu giriniz : 105
        Vücut Kitle İndeksiniz : 35.49215792320173

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz örneğin (1,72) : ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = scanner.nextInt();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);


    }
}
