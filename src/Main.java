import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String raporSayisi;

        System.out.print("Lütfen rapor sayısını giriniz = ");
        int n = scanner.nextInt();

        System.out.print("Lütfen raporlarınızdaki seviye sayısını giriniz = ");
        int m = scanner.nextInt();

        scanner.nextLine();

        for (int i = 1; i <= n; ++i) {
            System.out.print(i + ". rapordaki seviyeleri giriniz = ");
            raporSayisi = scanner.nextLine();
        }

    }
}