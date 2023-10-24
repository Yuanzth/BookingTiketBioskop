import java.util.Scanner;

public class BookingTiketBioskop {

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int hrg_std, jml_tiket, hrg_sblm_ppn;
        double ppn, hrg_stlh_ppn;
        String[] jdl_film = {"The Nun II", "Kisah Tanah Jawa: Pocong Gundul", "The Sacred Riana 2: Bloody Mary", "No Hard Feelings", "His Only Son", "Gran Turismo"};
        String inputjdl;

        ppn = 0.1;
        System.out.println("Pilih film yang akan anda tonton");
        System.out.println(jdl_film[0]);
        System.out.println(jdl_film[1]);
        System.out.println(jdl_film[2]);
        System.out.println(jdl_film[3]);
        System.out.println(jdl_film[4]);
        System.out.println(jdl_film[5]);

        System.out.println("Masukan judul film : ");        
        inputjdl = input.nextLine();

        System.out.println("Masukan harga tiket studio");
        hrg_std = input.nextInt();

        System.out.println("masukan jumlah tiket yang anda pesan");
        jml_tiket = input.nextInt();

        hrg_sblm_ppn= hrg_std*jml_tiket;
        hrg_stlh_ppn= hrg_sblm_ppn+hrg_sblm_ppn*ppn;

        System.out.println("Harga Sebelum PPN = " +hrg_sblm_ppn);
        System.out.println("Film Anda = " +inputjdl);
        System.out.println("Total Transaksi Anda = " +hrg_stlh_ppn);

    }

}