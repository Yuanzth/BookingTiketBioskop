import java.util.Scanner;

public class finalyProjectBookingTiketBioskop {
    static int jdlinput = -1; // inisialisasi dengan nilai default yang tidak valid //
    static Scanner inputUntukJdlFilm = new Scanner(System.in);
    static String[] jdl_film = {"WISH", "Thr Marvel", "Napoleon"};
    static String filmTerpilih =                                                                                                                                                                            "";

    static Scanner inputUntukStudio = new Scanner(System.in);
    static int studioInput = -1; // inisialisasi dengan nilai default yang tidak valid//
    static String[] studioWISH = {"Deluxe"};
    static int[] hrg_stdWISH = {30000};
    static String[] studioTheMarvels = {"Deluxe"};
    static int [] hrg_stdTheMarvels = {30000,40000};
    static String [] studioNapoleon = {"The Premiere"};
    static int [] hrg_stdNapoleon = {50000};

    public static void main(String[] args) {
    
}
    static String getStudioTerpilih() {
    if (filmTerpilih.equalsIgnoreCase("WISH")) 
    {
        return studioWISH[studioInput];
    } 
    else if (filmTerpilih.equalsIgnoreCase("The Marvels")) 
    {
        return studioTheMarvels[studioInput];
    } 
    else if (filmTerpilih.equalsIgnoreCase("Napoleon")) 
    {
        return studioNapoleon[studioInput];
    } 
    else 
    {
        return "";
    }
    }
    static void PemilihanFILM(){
    // Pilih Film
    System.out.println("|==============================|");
    System.out.println("|Daftar Film yang Tersedia:    |");
    System.out.println("|==============================|"); 
    for (int i = 0; i < jdl_film.length; i++) 
    {
        System.out.println((i + 1) + ". " + jdl_film[i]);
    }
    System.out.println("|========================================|");
    System.out.print("  |Pilih nomor film yang ingin Anda tonton:|");
    System.out.println("|========================================|");
    jdlinput = inputUntukJdlFilm.nextInt();
    if (jdlinput >= 1 && jdlinput <= jdl_film.length) 
    {
        jdlinput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==========================================================================|");
        System.out.println("  |Film yang Anda pilih: " + jdl_film[jdlinput] +                           "|");
        System.out.println("|==========================================================================|");
    } 
    else 
    {
        System.out.println("|=============================================|");
        System.out.println("|Nomor film yang Anda masukkan tidak valid.   |");
        System.out.println("|=============================================|");
    }       
    }
    static void PemilihanStudioWish(){
        // Pilih Studio
        System.out.println("|==============================|");
        System.out.println("|Daftar Studio yang Tersedia:  |");
        System.out.println("|==============================|");
        for (int i = 0; i < studioWISH.length; i++) {
            System.out.println("|========================================================================================|");
            System.out.println((" |" + i + 1) + ". " + studioWISH[i] + " (Harga: " + hrg_stdWISH[i] + ")                   |");
            System.out.println("|========================================================================================|");
        }
        System.out.println("|==============================|");
        System.out.print("  |Pilih nomor studio:           |");
        System.out.println("|==============================|");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioWISH.length) 
        {
            studioInput--; // Mengurangi 1 karena array dimulai dari 0
            System.out.println("|==========================================================================|");
            System.out.println("  |Studio yang Anda pilih: " + studioWISH[studioInput]+"                     |");
            System.out.println("|==========================================================================|");
        } 
        else 
        {
            System.out.println("|===============================================|");
            System.out.println("|Nomor studio yang Anda masukkan tidak valid.   |");
            System.out.println("|===============================================|");
        }
    }
    static void PemilihanStudioTheMarvels(){
        // Pilih Studio
        System.out.println("|==============================|");
        System.out.println("|Daftar Studio yang Tersedia:  |");
        System.out.println("|==============================|");
        for (int i = 0; i < studioTheMarvels.length; i++) 
        {
            System.out.println("|========================================================================================|");
            System.out.println((" |" + i + 1) + ". " + studioTheMarvels[i] + " (Harga: " + hrg_stdTheMarvels[i] + ")       |");
            System.out.println("|========================================================================================|");
        }
        System.out.println("|==============================|");
        System.out.print("  |Pilih nomor studio:           |");
        System.out.println("|==============================|");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioTheMarvels.length) {
            studioInput--; // Mengurangi 1 karena array dimulai dari 0
            System.out.println("|==========================================================================|");
            System.out.println("  |Studio yang Anda pilih: " + studioTheMarvels[studioInput]+               "|");
            System.out.println("|==========================================================================|");
            
        } 
        else 
        {
            System.out.println("|===============================================|");
            System.out.println("|Nomor studio yang Anda masukkan tidak valid.   |");
            System.out.println("|===============================================|");
        }
    }
    static void PemilihanStudioNapoleon(){
        // Pilih 
        System.out.println("|==============================|");
        System.out.println("|Daftar Studio yang Tersedia:  |");
        System.out.println("|==============================|");
        for (int i = 0; i < studioNapoleon.length; i++) 
        {
            System.out.println("|========================================================================================|");
            System.out.println((" |"+(i + 1) + ". " + studioNapoleon[i] + " (Harga: " + hrg_stdNapoleon[i])+"              |");
            System.out.println("|========================================================================================|");
        }
        System.out.println("|==============================|");
        System.out.print("  |Pilih nomor studio:           |");
        System.out.println("|==============================|");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioNapoleon.length) 
        {
            studioInput--; // Mengurangi 1 karena array dimulai dari 0
            System.out.println("|==========================================================================|");
            System.out.println("  |Studio yang Anda pilih: " + studioNapoleon[studioInput]+                 "|");
            System.out.println("|==========================================================================|");
        } 
        else 
        {
            System.out.println("|===============================================|");
            System.out.println("|Nomor studio yang Anda masukkan tidak valid.   |");
            System.out.println("|===============================================|");
        }
    }
}

