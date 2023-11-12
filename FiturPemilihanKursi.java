import java.util.Scanner;

public class FiturPemilihanKursi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean lanjutPilihKursi = true;
        char[][] kursi = new char[5][5]; // Studio dengan 5 baris dan 5 kolom
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                kursi[i][j] = '0'; // Semua kursi awalnya kosong ('0')
            }
        }

        while (lanjutPilihKursi) {
            System.out.println("Status Kursi (X: Terisi, O: Kosong):");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(" | " + kursi[i][j] + " | ");
                }
                System.out.println();
            }
            System.out.print("Pilih baris (1-5) dan kolom (1-5) kursi atau ketik '0 dan 0' untuk selesai: ");
            int baris = input.nextInt();
            int kolom = input.nextInt();

            if (baris == 0 || kolom == 0) {
                lanjutPilihKursi = false;
                System.out.println("Pemilihan kursi dibatalkan.");
            } else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) {
                if (kursi[baris - 1][kolom - 1] == '0') {
                    kursi[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    System.out.println("Anda telah memilih kursi Baris " + baris + ", Kolom " + kolom);
                } else {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi yang lain.");
                }
            } else {
                System.out.println("Nomor baris atau kolom tidak valid.");
            }
        }
        System.out.println("Pilihan kursi Anda:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (kursi[i][j] == 'X') {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1));
                }
            }
        }
        
        System.out.println("Terima kasih telah memilih kursi! Selamat menonton film.");           
    }
}
