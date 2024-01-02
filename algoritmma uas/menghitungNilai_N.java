import java.util.Scanner;
public class menghitungNilai_N {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        calculateSeriesSum(n);
    }

    public static void calculateSeriesSum(int n) {
        double totalSum = 0.0;
        System.out.println("Enter number of terms of series: " + n);
        for (int i = 1; i <= n; i++) {
            double num = 1.0 / i;
            System.out.println("Number = " + i + " " + num);
            totalSum += num;
        }
        System.out.println("sum: " + totalSum);
    }
}
