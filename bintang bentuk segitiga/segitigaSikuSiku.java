public class segitigaSikuSiku {
    public static void main(String[] args) {
        int tinggiSegitiga = 5; // Anda dapat mengganti tinggi segitiga sesuai kebutuhan

        for (int baris = 1; baris <= tinggiSegitiga; baris++) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}