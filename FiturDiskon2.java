import java.util.Scanner;

public class FiturDiskon2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] jdl_film = {"The Nun II", "Kisah Tanah Jawa: Pocong Gundul", "The Sacred Riana 2: Bloody Mary", "No Hard Feelings", "His Only Son", "Gran Turismo"};
        int[] hrg_std = {30000, 40000, 50000, 60000};
        String[] nama_studio = {"Deluxe", "Dolby Atmos", "IMAX", "The Premiere"};
        double[][] diskon_film = new double[jdl_film.length][nama_studio.length];

        System.out.println("Pilih film yang akan anda tonton:");

        for (int i = 0; i < jdl_film.length; i++) {
            System.out.println((i + 1) + ". " + jdl_film[i]);
        }

        System.out.print("Masukkan nomor film yang ingin Anda tonton: ");
        int jdlinput = input.nextInt();

        if (jdlinput >= 1 && jdlinput <= jdl_film.length) {
            String selectedFilm = jdl_film[jdlinput - 1];
            System.out.println("Film Anda = " + selectedFilm);

            char tipe_studio, cekStudio;
            double totalHarga = 0;
            int studioIndex = -1; // Initialize studioIndex

            do {
                cekStudio = 'A';
                do {
                    System.out.println("|=============================================================|");
                    System.out.println("|    Hello Film Addict! Selamat datang di POLINEMA Studio.    |");
                    System.out.println("|=============================================================|");
                    System.out.println("|             Mau nonton di studio mana hari ini?             |");
                    System.out.println("|=============================================================|");
                    System.out.println("|       Silahkan pesan tipe studio yang ingin anda pilih      |");
                    System.out.println("| A : Deluxe                                                  |");
                    System.out.println("| B : Dolby Atmos                                             |");
                    System.out.println("| C : IMAX                                                    |");
                    System.out.println("| D : The Premiere                                            |");
                    System.out.println("|=============================================================|");

                    tipe_studio = input.next().charAt(0);

                    if (tipe_studio >= 'A' && tipe_studio <= 'D') {
                        studioIndex = tipe_studio - 'A'; // Update studioIndex
                        System.out.println("===============================================================");
                        System.out.println("Studio yang anda pilih adalah\t : " + nama_studio[studioIndex] + "\nDengan harga\t\t\t :" + hrg_std[studioIndex]);
                        System.out.println("===============================================================");
                        totalHarga += hrg_std[studioIndex];
                        System.out.println("           Silahkan melanjutkan untuk memilih kursi            ");
                        System.out.println("===============================================================");
                    } else {
                        System.out.println("|================================================================|");
                        System.out.println("|      Mohon maaf, Studio yang anda masukkan tidak tersedia      |");
                        System.out.println("|              Silahkan ulangi pilihan studio anda               |");
                        System.out.println("|================================================================|");
                        cekStudio = 'E';
                    }

                } while (cekStudio == 'E');

                System.out.println("|================================================================|");
                System.out.println("|          Apakah Anda ingin melanjutkan memilih kursi :         |");
                System.out.println("|================================================================|");
                System.out.println("| A. Iya, saya ingin melanjutkan memilih kursi                   |");
                System.out.println("| B. Tidak, Saya ingin mengganti studio yang saya pilih          |");
                System.out.println("|================================================================|");
                cekStudio = input.next().charAt(0);
            } while (cekStudio == 'B');

            System.out.print("Apakah Anda memiliki diskon? (Y/N): ");
            char adaDiskon = input.next().charAt(0);
            double diskon = 0;

            if (adaDiskon == 'Y' || adaDiskon == 'y') 
            {
                System.out.println("Masukkan persentase diskon (5/10/15/20): ");
                diskon = input.nextDouble();
                if (diskon != 5 || diskon != 10 || diskon != 15 || diskon != 20)
                {
                    System.out.println("Diskon yang anda masukkan tidak berlaku.");
                    return;
                }
                
            }

            int filmIndex = jdlinput - 1;
            totalHarga *= (1 - diskon / 100 + diskon_film[filmIndex][studioIndex] / 100);

            System.out.println("|================================================================|");
            System.out.println("Total Harga: " + totalHarga);
            System.out.println("|================================================================|");
        } else 
        {
            System.out.println("Nomor film yang Anda masukkan tidak valid.");
        }
    }
}
