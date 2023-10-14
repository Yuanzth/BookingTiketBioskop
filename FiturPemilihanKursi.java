import java.util.Scanner;

public class FiturPemilihanKursi {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char baris;
        int nomor_bangku;

        cekKursi = 'A';
        do 
        {
        System.out.println("|===========================================|");
        System.out.println("|Terdapat Beberapa Nomor Baris yang Tersedia|");
        System.out.println("|Baris a                                    |");
        System.out.println("|Baris b                                    |");
        System.out.println("|Baris c                                    |");
        System.out.println("|Baris d                                    |");
        System.out.println("|Baris e                                    |");
        System.out.println("|===========================================|");

        System.out.println("Masukkan Baris yang anda inginkan");
        baris = input.next().charAt(0);

        switch (baris){
            case 'a':
            System.out.println("|=====================|");
            System.out.println("|Masukkan Nomor Bangku|");
            System.out.println("|=====================|");
            System.out.println("|1                    |");
            System.out.println("|2                    |");
            System.out.println("|=====================|");
            nomor_bangku = input.nextInt();
            if (nomor_bangku == 1)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else if (nomor_bangku == 2)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else
            {
                System.out.println("|===========================|");
                System.out.println("|Nomor Bangku Tidak Tersedia|");
                System.out.println("|===========================|");
            }
            break;

            case 'b':
            System.out.println("|=====================|");
            System.out.println("|Masukkan Nomor Bangku|");
            System.out.println("|=====================|");
            System.out.println("|1                    |");
            System.out.println("|2                    |");
            System.out.println("|=====================|");
            nomor_bangku = input.nextInt();
            if (nomor_bangku == 1)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else if (nomor_bangku == 2)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else 
            {
                System.out.println("|===========================|");
                System.out.println("|Nomor Bangku Tidak Tersedia|");
                System.out.println("|===========================|");
            }
            break;
            case 'c':
            System.out.println("|=====================|");
            System.out.println("|Masukkan Nomor Bangku|");
            System.out.println("|=====================|");
            System.out.println("|1                    |");
            System.out.println("|2                    |");
            System.out.println("|================== ===|");
            nomor_bangku = input.nextInt();
            if (nomor_bangku == 1)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else if (nomor_bangku == 2)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else 
            {
                System.out.println("|===========================|");
                System.out.println("|Nomor Bangku Tidak Tersedia|");
                System.out.println("|===========================|");
            }
            break;
            case 'd':
            System.out.println("|=====================|");
            System.out.println("|Masukkan Nomor Bangku|");
            System.out.println("|=====================|");
            System.out.println("|1                    |");
            System.out.println("|2                    |");
            System.out.println("|=====================|");
            nomor_bangku = input.nextInt();
            if (nomor_bangku == 1)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else if (nomor_bangku == 2)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else 
            {
                System.out.println("|===========================|");
                System.out.println("|Nomor Bangku Tidak Tersedia|");
                System.out.println("|===========================|");
            }
            break;

            case 'e':

            do {
            cekKursi = 'B';
            System.out.println("|=====================|");
            System.out.println("|Masukkan Nomor Bangku|");
            System.out.println("|=====================|");
            System.out.println("|1                    |");
            System.out.println("|2                    |");
            System.out.println("|=====================|");
            nomor_bangku = input.nextInt();
            if (nomor_bangku == 1)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else if (nomor_bangku == 2)
            {
                System.out.println("|===============================================|");
                System.out.println(  "|Baris yang anda pilih adalah " +baris+"                 |");                
                System.out.println("|Dan Nomor Bangku yang anda pilih adalah " +nomor_bangku+"      |");
                System.out.println("|===============================================|");
                System.out.println("|Silahkan Lanjutkan Pembayaran                  |");
                System.out.println("|===============================================|");
            }
            else
            {
                System.out.println("|===========================|");
                System.out.println("|Nomor Bangku Tidak Tersedia|");
                System.out.println("|===========================|");
                cekKursi = 'A';
                
            }
            } 
            
            while (cekKursi == 'A');
            break;
        }      
               System.out.println("|Apakah anda ingin melanjutkan pembayaran?      |");
               System.out.println("|===============================================|");
               System.out.println("|A. Iya, lanjutkan pembayaran                   |"); 
               System.out.println("|===============================================|");
               System.out.println("|B. Tidak, harap ulangi pemilihan kursi anda    |");
               System.out.println("|===============================================|");
               cekKursi = input.next().charAt(0);

        }
        while (cekKursi == 'B');
    }
 }
    
          