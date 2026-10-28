import java.util.Scanner;

public class Tugas309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko harus minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSemuaBarang = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;   
        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("\nToko " + toko);

            int jumlahPelanggan;
            do {
                System.out.print("  Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("  Jumlah pelanggan tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;  

            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("    Jumlah barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("    Jumlah barang tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            System.out.println("  Total pelanggan : " + jumlahPelanggan);
            System.out.println("  Total barang    : " + totalBarangToko);

            totalSemuaBarang += totalBarangToko;

            
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("\n==============================");
        System.out.println("Total barang seluruh toko : " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: Toko " + tokoTerbanyak
                + " (" + barangTerbanyak + " barang)");
        sc.close();
    }
}