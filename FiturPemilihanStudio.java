import java.util.Scanner;
public class FiturPemilihanStudio {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipe_studio, cekStudio;
        int[]hrg_std = {30000, 40000, 50000, 60000};
        String[]nama_studio = {"Deluxe","Dolby Atmos", "IMAX", "The Premiere"};

        cekStudio = 'A';

        do          
        {
            cekStudio = 'A';
        do 
        {
            cekStudio = 'A';
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

             
        if (tipe_studio == 'A') { 

            System.out.println("===============================================================");
            System.out.println("Studio yang anda pilih adalah\t : " + nama_studio[0] +"\nDengan harga\t\t\t :" +hrg_std[0]);
            System.out.println("===============================================================");
            System.out.println("           Silahkan melanjutkan untuk memilih kursi            ");
            System.out.println("===============================================================");

        }
        else if (tipe_studio == 'B') {
           
            System.out.println("===============================================================");
            System.out.println("Studio yang anda pilih adalah\t : " + nama_studio[1]+"\nDengan harga\t\t\t :" +hrg_std[1]);
            System.out.println("Silahkan melanjutkan untuk memilih kursi");
            System.out.println("===============================================================");
        }
        else if (tipe_studio == 'C') {
            
            System.out.println("===============================================================");
            System.out.println("Studio yang anda pilih adalah\t : " + nama_studio[2]+"\nDengan harga\t\t\t :" +hrg_std[2]);
            System.out.println("Silahkan melanjutkan untuk memilih kursi");
            System.out.println("===============================================================");
        }
        else if (tipe_studio == 'D') {
           
            System.out.println("===============================================================");
            System.out.println("Studio yang anda pilih adalah\t : " + nama_studio[3]+"\nDengan harga\t\t\t :" +hrg_std[3]);
            System.out.println("Silahkan melanjutkan untuk memilih kursi");
            System.out.println("===============================================================");
        }
        else {
            System.out.println("|================================================================|");
            System.out.println("|      Mohon maaf, Studio yang anda masukkan tidak tersedia      |");
            System.out.println("|              Silahkan ulangi pilihan studio anda               |");
            System.out.println("|================================================================|");
            cekStudio = 'E';
        }

        } 
        while (cekStudio == 'E');
        

        System.out.println("|================================================================|");
        System.out.println("|          Apakah Anda ingin melanjutkan memilih kursi :         |");
        System.out.println("|================================================================|");
        System.out.println("| A. Iya, saya ingin melanjutkan memilih kursi                   |");
        System.out.println("| B. Tidak, Saya ingin mengganti studio yang saya pilih          |");
        System.out.println("|================================================================|");
        cekStudio = input.next().charAt(0);
        }
        while (cekStudio == 'B');
    }
}
