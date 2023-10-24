import java.util.Scanner;

public class BookingTiketBioskop {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String[] jdl_film = {"The Nun II", "Kisah Tanah Jawa: Pocong Gundul", "The Sacred Riana 2: Bloody Mary", "No Hard Feelings", "His Only Son", "Gran Turismo"};

        System.out.println("Pilih film yang akan anda tonton:");
        
        for (int i = 0; i < jdl_film.length; i++) {
            System.out.println((i + 1) + ". " + jdl_film[i]);
        }

        System.out.print("Masukkan nomor film yang ingin Anda tonton: ");
        int jdlinput = input.nextInt();

        if (jdlinput >= 0 && jdlinput < jdl_film.length) {
            String selectedFilm = jdl_film[jdlinput - 1];
            System.out.println("Film Anda = " + selectedFilm);
        } else {
            System.out.println("Nomor film yang Anda masukkan tidak valid.");
        }
    }
}
