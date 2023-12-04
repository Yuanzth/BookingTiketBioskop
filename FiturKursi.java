import java.util.Scanner;

public class FiturKursi {
        
    //>>>>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Kursi Studio <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//
    static Scanner inputUntukPilihKursi = Scanner(System.in);
    static char[][] StudioDeluxeWish = new char[5][5];
    static char[][] StudioIMAXTheMarvels = new char [5][5];
    static char[][] StudioDeluxeTheMarvels = new char [5][5];
    static char[][] StudioThePremiereNapoleon = new char [5][5];
    static int indexKursiTerpilih = 0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Kursi Studio <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//

    static void PemilihanKursiStudioIMAXTheMarvels()
    {
        System.out.println("____________________________________________________");
        System.out.println("|Studio         |      LAYAR      |                |");
        System.out.println("|IMAX           ===================                |");
        System.out.println("|                                                  |");
        for (int i = 0; i < 5; i++)
        {
            char barisHuruf = (char) ('A' + i);
            System.out.print("|      ");
            for (int j = 0; j < 5; j++)
            {
                System.out.print(" [" + StudioDeluxeWish[i][j] + "]    ");
            }
            System.out.println("  |" + barisHuruf + "|" );
            System.out.println("|                                                  |");
        }
        System.out.println("|_______|1|_____|2|_____|3|_____|4|_____|5|________|");
        System.out.println("----------------------------------------------------");
        System.out.println("Silahkan memilih Kursi untuk Studio Deluxe: ");
        for (int i = 0; i < jumlahTiket; i++)
        {
            System.out.println("Kursi ke-" + (i+1) + ". ");
            System.out.print("Pilih kolom Baris (A-E) dan 0 untuk cancel: ");
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            System.out.println("Pilih kolom kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();
            
            if (barisHurufInput == '0' || kolom == 0)
            {
                System.out.println("Pemilihan kursi dibatalkan.");
                break; 
            }
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5)
            {
                if (StudioDeluxeWish[baris - 1][kolom - 1] == '0') 
                {
                StudioDeluxeWish[baris - 1][kolom - 1] = 'X';
                kursiTerpilih[indexKursiTerpilih] = "Baris" + barisHurufInput + ", Kolom " + kolom
                indexKursiTerpilih++
                System.out.println("Anda telah memilih kursi baris " + barisHurufInput + "Kolom" + kolom);
                }
                else 
                {
                    System.out.println("Kursi sudah terisi, Silahkan pilih kursi yang lain");
                    i--; //mengurangi input yang sudah terisi
                }
            }
            else
            {
                System.out.println("Nomor baris atau kolom tidak valid.");
                i--; // mengulang input
            }
        }
        System.out.println("Pilihan kursi Anda: ");
        for (int i = 0; i < indexKursiTerpilih; i++)
        {
            System.out.println(kursiTerpilih[i]);
        }
    }

    static void PemilihanKursiStudioIMAXTheMarvels()
    {
        System.out.println("____________________________________________________");
        System.out.println("|Studio         |      LAYAR      |                |");
        System.out.println("|IMAX           ===================                |");
        System.out.println("|                                                  |");
        for (int i = 0; i < 5; i++) 
        {
            char barisHuruf = (char) ('A' + i);
            System.out.print("|      ");
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(" [" + StudioIMAXTheMarvels[i][j] + "]    ");
            }
            System.out.println("  |"  + barisHuruf + "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|_______|1|_____|2|_____|3|_____|4|_____|5|________|");
        System.out.println("Silahkan memilih Kursi untuk Studio IMAX: ");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("Kursi ke-" + (i + 1) + ". ");
            System.out.print("Pilih kolom Baris (A-E) dan 0 untuk cancel: ");
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("Pemilihan kursi dibatalkan.");
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioIMAXTheMarvels[baris - 1][kolom - 1] == '0') 
                {
                    StudioIMAXTheMarvels[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "Baris " + barisHurufInput + ", Kolom " + kolom;
                    indexKursiTerpilih++;
                    System.out.println("Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom);
                } 
                else 
                {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi yang lain.");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("Nomor baris atau kolom tidak valid. Silakan coba lagi.");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        System.out.println("Pilihan kursi Anda:");
        for (int i = 0; i < indexKursiTerpilih; i++) {
            System.out.println(kursiTerpilih[i]);
        }
    }
    static void PemilihanKursiStudioDeluxeTheMarvels(){
        System.out.println("____________________________________________________");
        System.out.println("|Studio         |      LAYAR      |                |");
        System.out.println("|Deluxe         ===================                |");
        System.out.println("|                                                  |");
        for (int i = 0; i < 5; i++) 
        {
            char barisHuruf = (char) ('A' + i);
            System.out.print("|      ");
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(" [" + StudioDeluxeTheMarvels[i][j] + "]    ");
            }
            System.out.println("  |"  + barisHuruf + "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|_______|1|_____|2|_____|3|_____|4|_____|5|________|");
        System.out.println("Silahkan memilih Kursi untuk Studio Deluxe: ");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("Kursi ke-" + (i + 1) + ". ");
            System.out.print("Pilih kolom Baris (A-E) dan 0 untuk cancel: ");
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("Pemilihan kursi dibatalkan.");
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioDeluxeTheMarvels[baris - 1][kolom - 1] == '0') 
                {
                    StudioDeluxeTheMarvels[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "Baris " + barisHurufInput + ", Kolom " + kolom;
                    indexKursiTerpilih++;
                    System.out.println("Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom);
                } 
                else 
                {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi yang lain.");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("Nomor baris atau kolom tidak valid. Silakan coba lagi.");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        System.out.println("Pilihan kursi Anda:");
        for (int i = 0; i < indexKursiTerpilih; i++) 
        {
            System.out.println(kursiTerpilih[i]);
        }
    }
    static void PemilihanKursiStudioThePremiereNapoleon(){
        System.out.println("____________________________________________________");
        System.out.println("|Studio         |      LAYAR      |                |");
        System.out.println("|The Premiere   ===================                |");
        System.out.println("|                                                  |");
        for (int i = 0; i < 5; i++) {
            char barisHuruf = (char) ('A' + i);
            System.out.print("|      ");
            for (int j = 0; j < 5; j++) {
                System.out.print(" [" + StudioThePremiereNapoleon[i][j] + "]    ");
            }
            System.out.println("  |"  + barisHuruf + "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|_______|1|_____|2|_____|3|_____|4|_____|5|________|");
        System.out.println("Silahkan memilih Kursi untuk Studio The Premiere: ");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("Kursi ke-" + (i + 1) + ". ");
            System.out.print("Pilih kolom Baris (A-E) dan 0 untuk cancel: ");
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("Pemilihan kursi dibatalkan.");
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioThePremiereNapoleon[baris - 1][kolom - 1] == '0') 
                {
                    StudioThePremiereNapoleon[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "Baris " + barisHurufInput + ", Kolom " + kolom;
                    indexKursiTerpilih++;
                    System.out.println("Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom);
                } 
                else 
                {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi yang lain.");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("Nomor baris atau kolom tidak valid. Silakan coba lagi.");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        System.out.println("Pilihan kursi Anda:");
        for (int i = 0; i < indexKursiTerpilih; i++) {
            System.out.println(kursiTerpilih[i]);
        }
    }

    }

