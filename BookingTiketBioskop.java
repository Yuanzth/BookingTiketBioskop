import java.util.Scanner;

public class BookingTiketBioskop {

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        int hrg_std, jml_tiket, hrg_sblm_ppn;
        double ppn, hrg_stlh_ppn;
        String jdl_film;

        ppn=0.1;
        System.out.println("Pilih film yang akan anda tonton");
        System.out.println("The Nun II");
        System.out.println("Kisah Tanah Jawa: Pocong Gundul");
        System.out.println("The Sacred Riana 2: Bloody Mary");
        System.out.println("No Hard Feelings");
        System.out.println("His Only Son");
        System.out.println("Gran Turismo");

        System.out.println("Masukan judul film : ");        
        jdl_film = input.nextLine();

        System.out.println("Masukan harga tiket studio");
        hrg_std = input.nextInt();

        System.out.println("masukan jumlah tiket yang anda pesan");
        jml_tiket = input.nextInt();

        hrg_sblm_ppn= hrg_std*jml_tiket;
        hrg_stlh_ppn= hrg_sblm_ppn+hrg_sblm_ppn*ppn;

        System.out.println("Harga Sebelum PPN = " +hrg_sblm_ppn);
        System.out.println("Film Anda = " +jdl_film);
        System.out.println("Total Transaksi Anda = " +hrg_stlh_ppn);

    }

}