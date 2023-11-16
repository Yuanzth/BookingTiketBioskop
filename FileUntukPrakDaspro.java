import java.util.Scanner;

public class FileUntukPrakDaspro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] usernames = {"admin"};
        String[] passwords = {"admin123"};
        boolean isLoggedIn = false;
        String loggedInUser = "";

        System.out.println("Selamat datang di Sistem Booking Tiket Bioskop");

        while (!isLoggedIn) {
            System.out.print("Masukkan nama pengguna: ");
            String username = input.nextLine();
            System.out.print("Masukkan kata sandi: ");
            String password = input.nextLine();
            int userIndex = -1;
            for (int i = 0; i < usernames.length; i++) {
                if (usernames[i].equals(username) && passwords[i].equals(password)) {
                    userIndex = i;
                    break;
                }
            }
            if (userIndex >= 0) {
                isLoggedIn = true;
                loggedInUser = username;
                System.out.println("Selamat datang, " + loggedInUser + "!");
            } else {
                System.out.println("Login gagal. Periksa kembali nama pengguna dan kata sandi.");
            }
        }

        int jdlinput = -1; // Inisialisasi dengan nilai default yang tidak valid
        int studioInput = -1; // Inisialisasi dengan nilai default yang tidak valid
        int totalHarga = 0; // Inisialisasi variabel totalHarga

        // Data master ketersediaan film
        String[] jdl_film = {"The Nun II", "Kisah Tanah Jawa: Pocong Gundul", "The Sacred Riana 2: Bloody Mary", "No Hard Feelings", "His Only Son", "Gran Turismo"};
        int[] stok_film = {100, 150, 75, 200, 120, 80};
        int[] harga_film = {30000, 40000, 50000, 45000, 35000, 55000};

        // Data master tipe studio
        String[] nama_studio = {"Deluxe", "Dolby Atmos", "IMAX", "The Premiere"};
        int[] harga_studio = {30000, 40000, 50000, 60000};

        // Data booking
        String[][] booking = new String[jdl_film.length][nama_studio.length];
        boolean loopSemesta = true;
        while (loopSemesta) {
            System.out.println("Menu:");
            System.out.println("1. Pilih Film");
            System.out.println("2. Pilih Studio");
            System.out.println("3. Pilih Kursi");
            System.out.println("4. Metode Pembayaran");
            System.out.println("5. Pelaporan Harian");
            System.out.println("6. Pelaporan Bulanan");
            System.out.println("7. Cetak Struk Booking");
            System.out.println("8. Cek Stok Film");
            System.out.println("9. Keluar");
            System.out.print("Pilihan Anda: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    // Pilih Film
                    System.out.println("Daftar Film yang Tersedia:");
                    for (int i = 0; i < jdl_film.length; i++) {
                        System.out.println((i + 1) + ". " + jdl_film[i] + " (Stok: " + stok_film[i] + ")");
                    }
                    System.out.print("Pilih nomor film yang ingin Anda tonton: ");
                    jdlinput = input.nextInt();
                    if (jdlinput >= 1 && jdlinput <= jdl_film.length) {
                        jdlinput--; // Mengurangi 1 karena array dimulai dari 0
                        System.out.println("Film yang Anda pilih: " + jdl_film[jdlinput]);
                    } else {
                        System.out.println("Nomor film yang Anda masukkan tidak valid.");
                    }
                    break;

                case 2:
                    // Pilih Studio
                    System.out.println("Daftar Studio yang Tersedia:");
                    for (int i = 0; i < nama_studio.length; i++) {
                        System.out.println((i + 1) + ". " + nama_studio[i] + " (Harga: " + harga_studio[i] + ")");
                    }
                    System.out.print("Pilih nomor studio: ");
                    studioInput = input.nextInt();
                    if (studioInput >= 1 && studioInput <= nama_studio.length) {
                        studioInput--; // Mengurangi 1 karena array dimulai dari 0
                        System.out.println("Studio yang Anda pilih: " + nama_studio[studioInput]);
                    } else {
                        System.out.println("Nomor studio yang Anda masukkan tidak valid.");
                    }
                    break;

                case 3:
                    // Pilih Kursi
                    if (jdlinput == -1 || studioInput == -1) {
                        System.out.println("Pilih film dan studio terlebih dahulu.");
                        break;
                    }
                    char[][] kursi = new char[5][5]; // Misalnya ada studio dengan 5 baris dan 5 kolom
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            kursi[i][j] = '0';
                        }
                    }
                    boolean lanjutPilihKursi = true;
                    while (lanjutPilihKursi) {
                        System.out.println("Status Kursi (X: Terisi, O: Kosong):");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                System.out.print(" | " + kursi[i][j] + " | ");
                            }
                            System.out.println();
                        }
                        System.out.print("Pilih baris (1-5) kursi atau ketik '0' untuk selesai: ");
                        int baris = input.nextInt();
                        System.out.print("Pilih kolom (1-5) kursi atau ketik '0' untuk selesai: ");
                        int kolom = input.nextInt();
                        if (baris == 0 || kolom == 0) {
                            lanjutPilihKursi = false;
                            System.out.println("Pemilihan kursi dibatalkan.");
                        } else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) {
                            if (kursi[baris - 1][kolom - 1] == '0') {
                                kursi[baris - 1][kolom - 1] = 'X';
                                booking[jdlinput][studioInput] = "Baris " + baris + ", Kolom " + kolom;
                            } else {
                                System.out.println("Kursi sudah terisi.");
                            }
                        } else {
                            System.out.println("Nomor baris atau kolom tidak valid.");
                        }
                    }
                    break;

                case 4:
                    // Metode Pembayaran
                    if (jdlinput == -1 || studioInput == -1) {
                        System.out.println("Pilih film dan studio terlebih dahulu.");
                        break;
                    }
                    System.out.println("Film yang Anda pesan: " + jdl_film[jdlinput]);
                    System.out.println("Studio yang Anda pilih: " + nama_studio[studioInput]);
                    System.out.println("Kursi yang Anda pilih: " + booking[jdlinput][studioInput]);
                    totalHarga = harga_film[jdlinput] + harga_studio[studioInput];
                    System.out.println("Harga: " + totalHarga);
                    System.out.print("Masukkan jumlah uang: ");
                    int uangPembayaran = input.nextInt();
                    if (uangPembayaran >= totalHarga) {
                        int kembalian = uangPembayaran - totalHarga;
                        System.out.println("Pembayaran berhasil. Kembalian: " + kembalian);
                    } else {
                        System.out.println("Pembayaran tidak mencukupi.");
                    }
                    break;

                case 5:
                    // Pelaporan Harian
                    System.out.println("Pelaporan Harian:");
                    // Coming Soon
                    break;

                case 6:
                    // Pelaporan Bulanan
                    System.out.println("Pelaporan Bulanan:");
                    // Coming Soon
                    break;

                case 7:
                    // Cetak Struk Booking
                    if (jdlinput == -1 || studioInput == -1) {
                        System.out.println("Pilih film, studio, dan kursi terlebih dahulu.");
                        break;
                    }
                    System.out.println("==== Struk Booking ====");
                    System.out.println("Film: " + jdl_film[jdlinput]);
                    System.out.println("Studio: " + nama_studio[studioInput]);
                    System.out.println("Kursi: " + booking[jdlinput][studioInput]);
                    System.out.println("Harga: " + totalHarga);
                    System.out.println("Terima kasih telah melakukan booking.");
                    break;

                case 8:
                    // Cek Stok Film
                    System.out.println("Cek Stok Film:");
                    for (int i = 0; i < jdl_film.length; i++) {
                        System.out.println(jdl_film[i] + " (Stok: " + stok_film[i] + ")");
                    }
                    break;

                case 9:
                    System.out.println("Terima kasih telah menggunakan sistem booking tiket bioskop.");
                    loopSemesta = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
