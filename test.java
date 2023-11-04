import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] dailyReport = new int[31][4]; // 31 hari bulan, 4 kolom (film, studio, jumlah tiket terjual, pendapatan)
        int[][] monthlyReport = new int[4][4]; // 4 film, 4 studio (Deluxe, Dolby Atmos, IMAX, The Premiere)

        String[] filmNames = {"The Nun II", "Kisah Tanah Jawa: Pocong Gundul", "The Sacred Riana 2: Bloody Mary", "No Hard Feelings"};
        String[] studioNames = {"Deluxe", "Dolby Atmos", "IMAX", "The Premiere"};
        int[] studioPrices = {30000, 40000, 50000, 60000};

        while (true) {
            System.out.println("Selamat datang di Sistem Booking Tiket Bioskop");
            System.out.println("1. Pemesanan Tiket");
            System.out.println("2. Laporan Harian");
            System.out.println("3. Laporan Bulanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket(dailyReport, filmNames, studioNames, studioPrices);
                    break;
                case 2:
                    dailyReport(dailyReport, filmNames, studioNames);
                    break;
                case 3:
                    monthlyReport(dailyReport, monthlyReport, filmNames, studioNames);
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

    public static void bookTicket(int[][] dailyReport, String[] filmNames, String[] studioNames, int[] studioPrices) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih film yang akan Anda tonton:");
        for (int i = 0; i < filmNames.length; i++) {
            System.out.println((i + 1) + ". " + filmNames[i]);
        }
        System.out.print("Masukkan nomor film yang ingin Anda tonton: ");
        int filmChoice = scanner.nextInt();

        if (filmChoice >= 1 && filmChoice <= filmNames.length) {
            System.out.println("Pilih studio untuk film " + filmNames[filmChoice - 1] + ":");
            for (int i = 0; i < studioNames.length; i++) {
                System.out.println((i + 1) + ". " + studioNames[i] + " - Harga: " + studioPrices[i]);
            }
            System.out.print("Masukkan nomor studio: ");
            int studioChoice = scanner.nextInt();

            if (studioChoice >= 1 && studioChoice <= studioNames.length) {
                int selectedFilm = filmChoice - 1;
                int selectedStudio = studioChoice - 1;
                dailyReport[selectedFilm][selectedStudio + 2]++;

                System.out.println("Pemesanan tiket sukses!");
            } else {
                System.out.println("Nomor studio yang Anda masukkan tidak valid.");
            }
        } else {
            System.out.println("Nomor film yang Anda masukkan tidak valid.");
        }
    }

    public static void dailyReport(int[][] dailyReport, String[] filmNames, String[] studioNames) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tanggal (1-31): ");
        int date = scanner.nextInt();
        if (date >= 1 && date <= 31) {
            System.out.println("Laporan Harian untuk Tanggal " + date + ":");
            for (int i = 0; i < filmNames.length; i++) {
                for (int j = 0; j < studioNames.length; j++) {
                    int ticketsSold = dailyReport[i][j + 2];
                    if (ticketsSold > 0) {
                        System.out.println("Film: " + filmNames[i] + ", Studio: " + studioNames[j] + ", Tiket Terjual: " + ticketsSold);
                    }
                }
            }
        } else {
            System.out.println("Tanggal tidak valid.");
        }
    }

    public static void monthlyReport(int[][] dailyReport, int[][] monthlyReport, String[] filmNames, String[] studioNames) {
        System.out.println("Laporan Bulanan:");
        for (int i = 0; i < filmNames.length; i++) {
            for (int j = 0; j < studioNames.length; j++) {
                int ticketsSold = dailyReport[i][j + 2];
                if (ticketsSold > 0) {
                    monthlyReport[i][j] += ticketsSold;
                    monthlyReport[i][j + 2] += ticketsSold * studioPrices[j];
                    dailyReport[i][j + 2] = 0; // Reset harian setelah laporan bulanan
                }
            }
        }
        for (int i = 0; i < filmNames.length; i++) {
            for (int j = 0; j < studioNames.length; j++) {
                int ticketsSold = monthlyReport[i][j];
                if (ticketsSold > 0) {
                    System.out.println("Film: " + filmNames[i] + ", Studio: " + studioNames[j] + ", Tiket Terjual: " + ticketsSold);
                }
            }
        }
    }
}
