import java.util.Scanner;

public class Tugas209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan nilai n (minimal 3): ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Nilai n harus minimal 3. Ulangi input!");
            }
        } while (n < 3);

        int jumlahSeluruh = 0;   

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%5d", hasil);   
                jumlahSeluruh += hasil;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka pada tabel: " + jumlahSeluruh);
        sc.close();
    }
}