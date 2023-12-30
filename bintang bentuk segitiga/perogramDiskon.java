import java.util.Scanner;

public class PerogramDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah pelanggan memiliki membercard? (ya/tidak): ");
        String punyaMemberCard = scanner.nextLine().toLowerCase();

        if (punyaMemberCard.equals("ya")) {
            System.out.print("Total belanjaan: ");
            int totalBelanja = scanner.nextInt();

            if (totalBelanja > 500) {
                System.out.println("Diskon 50 ribu diberikan.");
            } else if (totalBelanja > 100) {
                System.out.println("Diskon 15 ribu diberikan.");
            } else {
                System.out.println("Tidak ada diskon.");
            }
 } else {
            System.out.print("Total belanjaan: ");
            int totalBelanja = scanner.nextInt();

            if (totalBelanja > 100) {
                System.out.println("Diskon 10 ribu diberikan.");
            } else {
                System.out.println("Tidak ada diskon.");
            }
        }

        scanner.close();
    }
}