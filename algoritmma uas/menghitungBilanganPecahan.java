import java.util.Scanner;
public class menghitungBilanganPecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        System.out.println("Jumlah dari seri pecahan adalah: " + sum);
        input.close();
    }
}
