import java.util.Scanner;

public class LaporanBookingTiketBioskop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] laporanHarian = new int[31][4]; // 31 hari bulan, 4 kolom (film, studio, jumlah tiket terjual, pendapatan)
        int[][] laporanBulanan = new int[4][4]; // 4 film, 4 studio (Deluxe, Dolby Atmos, IMAX, The Premiere)

        String[] namaFilm = {"The Nun II", "Kisah Tanah Jawa: Pocong Gundul", "The Sacred Riana 2: Bloody Mary", "No Hard Feelings"};
        String[] namaStudio = {"Deluxe", "Dolby Atmos", "IMAX", "The Premiere"};
        int[] hargaStudio = {30000, 40000, 50000, 60000};

        while (true) {
            System.out.println("Selamat datang di Sistem Booking Tiket Bioskop");
            System.out.println("1. Pemesanan Tiket");
            System.out.println("2. Laporan Harian");
            System.out.println("3. Laporan Bulanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pesanTiket(laporanHarian, namaFilm, namaStudio, hargaStudio);
                    break;
                case 2:
                    laporanHarian(laporanHarian, namaFilm, namaStudio);
                    break;
                case 3:
                    laporanBulanan(laporanHarian, laporanBulanan, namaFilm, namaStudio, hargaStudio);
                    break;
                case 4:
                    System.out.println("Terima kasih, sampai jumpa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void pesanTiket(int[][] laporanHarian, String[] namaFilm, String[] namaStudio, int[] hargaStudio) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih film yang akan Anda tonton:");
        for (int i = 0; i < namaFilm.length; i++) {
            System.out.println((i + 1) + ". " + namaFilm[i]);
        }
        System.out.print("Masukkan nomor film yang ingin Anda tonton: ");
        int pilihanFilm = scanner.nextInt();

        if (pilihanFilm >= 1 && pilihanFilm <= namaFilm.length) {
            System.out.println("Pilih studio untuk film " + namaFilm[pilihanFilm - 1] + ":");
            for (int i = 0; i < namaStudio.length; i++) {
                System.out.println((i + 1) + ". " + namaStudio[i] + " - Harga: " + hargaStudio[i]);
            }
            System.out.print("Masukkan nomor studio: ");
            int pilihanStudio = scanner.nextInt();

            if (pilihanStudio >= 1 && pilihanStudio <= namaStudio.length) {
                int filmTerpilih = pilihanFilm - 1;
                int studioTerpilih = pilihanStudio - 1;
                laporanHarian[filmTerpilih][studioTerpilih + 2]++;

                System.out.println("Pemesanan tiket sukses!");
            } else {
                System.out.println("Nomor studio yang Anda masukkan tidak valid.");
            }
        } else {
            System.out.println("Nomor film yang Anda masukkan tidak valid.");
        }
    }

    public static void laporanHarian(int[][] laporanHarian, String[] namaFilm, String[] namaStudio) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal (1-31): ");
        int tanggal = scanner.nextInt();
        if (tanggal >= 1 && tanggal <= 31) {
            System.out.println("Laporan Harian untuk Tanggal " + tanggal + ":");
            for (int i = 0; i < namaFilm.length; i++) {
                for (int j = 0; j < namaStudio.length; j++) {
                    int tiketTerjual = laporanHarian[i][j + 2];
                    if (tiketTerjual > 0) {
                        System.out.println("Film: " + namaFilm[i] + ", Studio: " + namaStudio[j] + ", Tiket Terjual: " + tiketTerjual);
                    }
                }
            }
        } else {
            System.out.println("Tanggal tidak valid.");
        }
    }

    public static void laporanBulanan(int[][] laporanHarian, int[][] laporanBulanan, String[] namaFilm, String[] namaStudio, int[] hargaStudio) {
        System.out.println("Laporan Bulanan:");
        for (int i = 0; i < namaFilm.length; i++) {
            for (int j = 0; j < namaStudio.length; j++) {
                int tiketTerjual = laporanHarian[i][j + 2];
                if (tiketTerjual > 0) {
                    laporanBulanan[i][j] += tiketTerjual;
                    laporanBulanan[i][j + 2] += tiketTerjual * hargaStudio[j];
                    laporanHarian[i][j + 2] = 0; // Reset harian setelah laporan bulanan
                }
            }
        }
        for (int i = 0; i < namaFilm.length; i++) {
            for (int j = 0; j < namaStudio.length; j++) {
                int tiketTerjual = laporanBulanan[i][j];
                if (tiketTerjual > 0) {
                    System.out.println("Film: " + namaFilm[i] + ", Studio: " + namaStudio[j] + ", Tiket Terjual: " + tiketTerjual);
                }
            }
        }
    }
}
