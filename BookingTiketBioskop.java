import java.util.Scanner;

public class BookingTiketBioskop {
    //==================================================//
    static void fillArrayWithZero(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '0';
            }
        }
    }    
    public static String spaces(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(" ");
        }
        return result.toString();
    }
    static int hitungTotalHarga() {
        int hargaTiket = 0;
        if (filmTerpilih.equalsIgnoreCase("WISH")) 
        {
            hargaTiket = hrg_stdWISH[studioInput] * jumlahTiket;
        } 
        else if (filmTerpilih.equalsIgnoreCase("The Marvels")) 
        {
            if (studioInput == 0) 
            {
                hargaTiket = hrg_stdTheMarvels[0] * jumlahTiket;
            } 
            else if (studioInput == 1) 
            {
                hargaTiket = hrg_stdTheMarvels[1] * jumlahTiket;
            }
        } 
        else if (filmTerpilih.equalsIgnoreCase("Napoleon")) 
        {
            hargaTiket = hrg_stdNapoleon[studioInput] * jumlahTiket;
        }
        return hargaTiket;
    }   
    static String getStudioTerpilih() {
        if (filmTerpilih.equalsIgnoreCase("WISH")) {
            return studioWISH[studioInput];
        } else if (filmTerpilih.equalsIgnoreCase("The Marvels")) {
            return studioTheMarvels[studioInput];
        } else if (filmTerpilih.equalsIgnoreCase("Napoleon")) {
            return studioNapoleon[studioInput];
        } else {
            return "";
        }
    }
    //==================================================//
    static String[] usernames = {"kasir1", "kasir2"};
    static String[] passwords = {"123", "456"};
    static String[] userAdmin = {"admin"};
    static String[] passAdmin = {"admin123"};
    static Scanner input = new Scanner(System.in);

    //>>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Pemilihan Film <<<<<<<<<<<<<<<<<<<<<<<<<<<//
    static int jdlinput = -1; // Inisialisasi dengan nilai default yang tidak valid
    static Scanner inputUntukJdlFilm = new Scanner(System.in);
    static String[] jdl_film = {"WISH", "The Marvels", "Napoleon"};
    static String filmTerpilih = "";
    //>>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Pemilihan Film <<<<<<<<<<<<<<<<<<<<<<<<<<<//

    //>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Pemilihan Studio <<<<<<<<<<<<<<<<<<<<<<<<<<//
    static Scanner inputUntukStudio = new Scanner(System.in);
    static int studioInput = -1; // Inisialisasi dengan nilai default yang tidak valid
    static String[] studioWISH = {"Deluxe"};
    static int[] hrg_stdWISH = {30000};
    static String[] studioTheMarvels = {"Deluxe", "IMAX"};
    static int[] hrg_stdTheMarvels = {30000,40000};
    static String[] studioNapoleon = {"The Premiere"};
    static int[] hrg_stdNapoleon = {50000};
    //>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Pemilihan Studio <<<<<<<<<<<<<<<<<<<<<<<<<<//

    // >>>>>>> Variabel dan fungsi untuk jumlah tiket dan pemilihan kursi <<<<<<<< //
    static int jumlahTiket = 0;
    static String[] kursiTerpilih = new String[25]; // Menyimpan indeks kursi yang dipilih
    // >>>>>>> Variabel dan fungsi untuk jumlah tiket dan pemilihan kursi <<<<<<<< //

    //>>>>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Kursi Studio <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//
    static Scanner inputUntukPilihKursi = new Scanner(System.in);
    static char[][] StudioDeluxeWish = new char[5][5]; // StudioDeluxeWish dengan 5 baris dan 5 kolom
    static char[][] StudioIMAXTheMarvels = new char[5][5]; // StudioIMAXTheMarvels dengan 5 baris dan 5 kolom
    static char[][] StudioDeluxeTheMarvels = new char[5][5]; // StudioDeluxeTheMarvels dengan 5 baris dan 5 kolom
    static char[][] StudioThePremiereNapoleon = new char[5][5]; // StudioThePremiereNapoleon dengan 5 baris dan 5 kolom
    static int indexKursiTerpilih = 0; // Menunjukkan indeks terakhir kursi terpilih
    static boolean isPemilihanDibatalkan = false;
    //>>>>>>>>>>>>>>>>>>>>>>>>>> Kebutuhan Untuk Kursi Studio <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<//

    //>>>>>>>>>>>>>>>>>>>>>>>>>> 
    static int[] historyJumlahTiketKasir1 = new int[100]; // Menggunakan array dengan ukuran tertentu
    static int[] historyJumlahTiketKasir2 = new int[100];
    static int[] historyPendapatanKasir1 = new int[100];
    static int[] historyPendapatanKasir2 = new int[100];
    static int indexHistoryKasir1 = 0; // Menunjukkan indeks terakhir dalam array
    static int indexHistoryKasir2 = 0;
    static String loggedInUser = "";
    static String[] historyFilm = new String[100];
    static String[] historyStudio = new String[100];
    static int[] historyJumlahTiket = new int[100];
    static int[] historyPendapatan = new int[100];
    static int indexHistory = 0;    
    //>>>>>>>>>>>>>>>>>>>>>>>>>> 
    public static void main(String[] args) {
        fillArrayWithZero(StudioDeluxeWish);
        fillArrayWithZero(StudioIMAXTheMarvels);
        fillArrayWithZero(StudioDeluxeTheMarvels);
        fillArrayWithZero(StudioThePremiereNapoleon);

        boolean PilihLanguage = true;
        while (PilihLanguage) {
            System.out.println("|==================================================|");
            System.out.println("|           Pilih Bahasa/Select Language           |");
            System.out.println("|==================================================|");
            System.out.println("|             1. Indonesia                         |");
            System.out.println("|             2. English                           |");
            System.out.println("|             3. Exit                              |");
            System.out.println("|==================================================|");

            System.out.print(  "|                   Pilih opsi: ");
            int menuUtamaChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (menuUtamaChoice) {
                case 1:
                    MainBahasa();
                    break;
                case 2:
                    MainEnglish();
                    break;
                case 3:
                    PilihLanguage = false;
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                       Invalid                      ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }
    }
//=======================================================================================================//
//===========================               BAHASA INDONESIA              ===============================//
//=======================================================================================================//
    static void MainBahasa(){
        boolean programRunning = true;
        while (programRunning) {
            System.out.println("|==================================================|");
            System.out.println("|                    Menu Utama                    |");
            System.out.println("|==================================================|");
            System.out.println("|             1. Login sebagai Kasir               |");
            System.out.println("|             2. Login sebagai Admin               |");
            System.out.println("|             3. Exit                              |");
            System.out.println("|==================================================|");

            System.out.print(  "|                   Pilih opsi: ");
            int menuUtamaChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (menuUtamaChoice) {
                case 1:
                    loginKasir();
                    break;
                case 2:
                    loginAdmin();
                    break;
                case 3:
                    programRunning = false;
                    System.out.println("Program berakhir.");
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }        
    }
    static void loginKasir() {
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("|          Pilih opsi untuk melanjutkan!           |");
            System.out.println("|==================================================|");
            System.out.println("|            1. Lanjut Sebagai Kasir               |");
            System.out.println("|            2. Kembali ke Menu Utama              |");
            System.out.println("|==================================================|");
            System.out.print(  "|                   Pilih opsi: ");
            int exitChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (exitChoice) {
                case 1:
                    isLoggedIn = validateLoginAsKasir();
                    if (isLoggedIn) {
                        processKasirMenu();
                    }
                    break;
                case 2:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }
    }
    static void processKasirMenu() {
        boolean isLoggedIn = true; // Tambahkan variabel untuk status login
    
        while (isLoggedIn) {
            System.out.println("|                     Menu Kasir                   |");
            System.out.println("|==================================================|");
            System.out.println("|                 1. Pemesanan Tiket               |");
            System.out.println("|                 2. Logout                        |");
            System.out.println("|==================================================|");
    
            System.out.print(  "|                    Pilih opsi: ");
            int menuChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (menuChoice) {
                case 1:
                    isPemilihanDibatalkan = false;
                    PemilihanFILM();
                    filmTerpilih = jdl_film[jdlinput];
    
                    if (filmTerpilih.equalsIgnoreCase("WISH")) {
                        PemilihanStudioWish();
                        if (studioInput == 0) {
                            PemilihanJumlahTiket();
                            PemilihanKursiStudioDeluxeWish();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasan();
                                prosesPembayaran();
                            }
                        }
                    } else if (filmTerpilih.equalsIgnoreCase("The Marvels")) {
                        PemilihanStudioTheMarvels();
                        if (studioInput == 0) {
                            PemilihanJumlahTiket();
                            PemilihanKursiStudioDeluxeTheMarvels();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasan();
                                prosesPembayaran();
                            }
                        } else if (studioInput == 1) {
                            PemilihanJumlahTiket();
                            PemilihanKursiStudioIMAXTheMarvels();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasan();
                                prosesPembayaran();
                            }
                        }
                    } else if (filmTerpilih.equalsIgnoreCase("Napoleon")) {
                        PemilihanStudioNapoleon();
                        if (studioInput == 0) {
                            PemilihanJumlahTiket();
                            PemilihanKursiStudioThePremiereNapoleon();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasan();
                                prosesPembayaran();
                            }
                        }
                    }
                    break;
    
                case 2:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                   Logout " + loggedInUser + "                    " );
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    isLoggedIn = false; // Set status login menjadi false
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.     ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");

                    break;
            }
        }
        // Setelah keluar dari loop, status login kasir direset
        isLoggedIn = false;
    }
    static boolean validateLoginAsKasir() {
        Scanner inputUser = new Scanner(System.in);
        String username, password;
    
        System.out.print("|    Masukkan nama pengguna: ");
        username = inputUser.nextLine();  // Gunakan inputUser di sini
        System.out.println("|==================================================|");
        System.out.print("|    Masukkan kata sandi: ");
        password = inputUser.nextLine();  // Juga gunakan inputUser di sini
        System.out.println("|==================================================|");
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                loggedInUser = username; // Set pengguna yang sedang login
                System.out.println("|             Selamat datang, " + loggedInUser + "!              |");
                System.out.println("|==================================================|");
                return true; // Login sukses
            }
        }
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("            Login gagal, Periksa Kembali!           ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");

        return false; // Login gagal
    }
//======================================================================================//
    static void loginAdmin(){
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("|            Pilih opsi untuk melanjutkan!         |");
            System.out.println("|==================================================|");
            System.out.println("|            1. Lanjut Sebagai Admin               |");
            System.out.println("|            2. Kembali ke Menu Utama              |");
            System.out.println("|==================================================|");
            System.out.print(  "|            Pilih opsi: ");
            int exitChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (exitChoice) {
                case 1:
                    isLoggedIn = validateLoginAsAdmin();
                    if (isLoggedIn) {
                        processAdminMenu();
                    }
                    break;
                case 2:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.     ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }
    }
    static boolean validateLoginAsAdmin() {
        Scanner inputUser = new Scanner(System.in);
        String username, password;

        System.out.print("|          Masukkan nama pengguna: ");
        username = inputUser.nextLine();  // Gunakan inputUser di sini
        System.out.println("|==================================================|");

    
        System.out.print("|          Masukkan kata sandi: ");
        password = inputUser.nextLine();  // Juga gunakan inputUser di sini
    
        for (int i = 0; i < usernames.length; i++) {
            if (userAdmin[i].equals(username) && passAdmin[i].equals(password)) {
                loggedInUser = username; // Set pengguna yang sedang login
                System.out.println("|               Selamat datang, " + loggedInUser + "!             |");
                System.out.println("|==================================================|");
                return true; // Login sukses
            }
        }
        System.out.println("|           Login gagal, Periksa Kembali!          |");
        System.out.println("|==================================================|");
        return false; // Login gagal
    }
    static void processAdminMenu(){
        
        boolean isLoggedIn = true;

        while (isLoggedIn) {
            System.out.println("                                                    ");
            System.out.println("|==================================================|");
            System.out.println("|                      Menu:                       |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 1. Tampilkan History Transaksi Kasir             |");
            System.out.println("| 2. Tampilkan History Transaksi Keseluruhan       |");
            System.out.println("| 3. Logout                                        |");
            System.out.println("|--------------------------------------------------|");

            System.out.print("| Pilih opsi: ");
            int menuChoice = input.nextInt();

            switch (menuChoice) {
                case 1:
                    tampilkanHistoryTransaksi();                            
                    break;
                case 2:
                    tampilkanHistoryTransaksiAll();
                    break;                          

                case 3:
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                   Logout " + loggedInUser + "                    " );
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    isLoggedIn = false; // Set status login menjadi false
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("      Pilihan tidak valid. Silakan pilih lagi.     ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                   ");
                    break;
            }
        }  
    }
    static void tampilkanRingkasan() 
    {
        System.out.println("                                                    ");
        System.out.println("|==================================================|");
        System.out.println("|               - Ringkasan Pemesanan -            |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                Film: " + filmTerpilih + spaces(50 - (String.valueOf(filmTerpilih).length() + 22)) + "|");
        System.out.println("|                Studio: " + getStudioTerpilih() + spaces(50 - (getStudioTerpilih().length() + 24)) + "|");
        System.out.println("|                Jumlah Tiket: " + jumlahTiket + spaces(50 - (String.valueOf(jumlahTiket).length() + 30)) + "|");
        System.out.println("|                Pilihan Kursi:                    |");
        for (int i = 0; i < indexKursiTerpilih; i++)
        {
            System.out.println(kursiTerpilih[i]);
        }
        System.out.println("|==================================================|");
        kursiTerpilih = new String[25]; // Reset array kursiTerpilih
        indexKursiTerpilih = 0; //Reset index kursi
    }    
    static void prosesPembayaran() 
    {
        System.out.println("                                                    ");
        System.out.println("|==================================================|");
        System.out.println("|                - Proses Pembayaran -             |");
        System.out.println("|--------------------------------------------------|");
        System.out.println(  "|                Total Harga: " + hitungTotalHarga());
        if (loggedInUser.equals("kasir1")) {
            historyJumlahTiketKasir1[indexHistoryKasir1] = jumlahTiket;
            historyPendapatanKasir1[indexHistoryKasir1] = hitungTotalHarga();
            indexHistoryKasir1++;
        } else if (loggedInUser.equals("kasir2")) {
            historyJumlahTiketKasir2[indexHistoryKasir2] = jumlahTiket;
            historyPendapatanKasir2[indexHistoryKasir2] = hitungTotalHarga();
            indexHistoryKasir2++;
        }
        //logika untuk merekam history transaksi secara keseluruhan
        historyFilm[indexHistory] = filmTerpilih;
        historyStudio[indexHistory] = getStudioTerpilih();
        historyJumlahTiket[indexHistory] = jumlahTiket;
        historyPendapatan[indexHistory] = hitungTotalHarga();
        indexHistory++;
        
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                Pilih metode pembayaran:          |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                1. Tunai                          |");
        System.out.println("|                2. Kartu Kredit                   |");
        System.out.println("|==================================================|");
        int metodePembayaran = input.nextInt();
        if (metodePembayaran == 1) 
        {
            System.out.println("|==================================================|");
            System.out.println("|    Pembayaran berhasil. Tiket telah terpesan!    |");
            System.out.println("|==================================================|");
            System.out.println("                                                    ");

        } 
        else if (metodePembayaran == 2) 
        {
            System.out.println("|==================================================|");
            System.out.println("|           Masukkan nomor kartu kredit:           |");
            String nomorKartuKredit = input.next();
            System.out.println("|==================================================|");
            System.out.println("|    Pembayaran berhasil. Tiket telah terpesan!    |");
            System.out.println("|==================================================|");
        } 
        else 
        {
            System.out.println("                                                    ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("           Metode pembayaran tidak valid.           ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("                                                    ");

        }
    }
    static void tampilkanHistoryTransaksi() {
        System.out.println("                                                    ");
        System.out.println("|==================================================|");
        System.out.println("|               - History Transaksi -              |");
        System.out.println("|==================================================|");
        System.out.println("| Kasir 1:                                         |");
    
        for (int i = 0; i < indexHistoryKasir1; i++) {
            System.out.println("| > Transaksi " + (i + 1) + ": Jumlah Tiket = " + historyJumlahTiketKasir1[i] +
                    spaces(51 - (String.valueOf(historyJumlahTiketKasir1[i]).length()+32)) + "|");
            System.out.println("|                Pendapatan = " + historyPendapatanKasir1[i] +
                    spaces(51 - (String.valueOf(historyPendapatanKasir1[i]).length()+30)) + "|");
            System.out.println("|" + spaces(50) + "|");
        }
        System.out.println("|--------------------------------------------------|");
        System.out.println("| Kasir 2:                                         |");
        for (int i = 0; i < indexHistoryKasir2; i++) {
            System.out.println("| > Transaksi " + (i + 1) + ": Jumlah Tiket = " + historyJumlahTiketKasir2[i] +
                    spaces(51 - (String.valueOf(historyJumlahTiketKasir2[i]).length()+32)) + "|");
            System.out.println("|                Pendapatan = " + historyPendapatanKasir2[i] +
                    spaces(51 - (String.valueOf(historyPendapatanKasir2[i]).length()+30)) + "|");
          System.out.println("|" + spaces(50) + "|");
        }
        System.out.println("|==================================================|");
    }    
    static void tampilkanHistoryTransaksiAll() {
        System.out.println("|==================================================|");
        System.out.println("|               - History Transaksi -              |");
        System.out.println("|==================================================|");
    
        for (int i = 0; i < indexHistory; i++) {
            System.out.println("| > Transaksi " + (i + 1) + ": Film = " + historyFilm[i] +
                    spaces(50 - (historyFilm[i].length() + 23)) +
                    "|");
            System.out.println("|                Studio = " + historyStudio[i] +
                    spaces(50 - (historyStudio[i].length() + 25)) +
                    "|");
            System.out.println("|                Jumlah Tiket = " + historyJumlahTiket[i] +
                    spaces(50 - (String.valueOf(historyJumlahTiket[i]).length() + 31)) +
                    "|");
            System.out.println("|                Pendapatan = " + historyPendapatan[i] +
                    spaces(50 - (String.valueOf(historyPendapatan[i]).length() + 29)) +
                    "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|==================================================|");
    }    
    static void PemilihanFILM() {
        // Pilih Film
        System.out.println("|==================================================|");
        System.out.println("|              Daftar Film yang Tersedia:          |");
        System.out.println("|==================================================|");
        for (int i = 0; i < jdl_film.length; i++) {
            System.out.println("|              " + (i + 1) + ". " + jdl_film[i] + spaces(51 - (jdl_film[i].length() + 18)) + "|");
        }
        do {
            System.out.println("|==================================================|");
            System.out.print("|   Pilih nomor film yang ingin Anda tonton: ");
            jdlinput = inputUntukJdlFilm.nextInt();

            if (jdlinput >= 1 && jdlinput <= jdl_film.length) {
                jdlinput--; // Mengurangi 1 karena array dimulai dari 0
                System.out.println("|    Film yang Anda pilih: " + jdl_film[jdlinput] + spaces(51 - (jdl_film[jdlinput].length() + 27)) + "|");
                return;
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("      Nomor film yang Anda masukkan tidak valid.    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("                                                    ");
            }
        } while (jdlinput < 1 || jdlinput > jdl_film.length);
    }

    static void PemilihanStudioWish(){
        // Pilih Studio
        System.out.println("|==================================================|");
        System.out.println("|            Daftar Studio yang Tersedia:          |");
        System.out.println("|==================================================|");
        for (int i = 0; i < studioWISH.length; i++) {
        System.out.println(  "|             " + (i + 1) + ". " + studioWISH[i] + " (Harga: " + hrg_stdWISH[i]+")" + spaces(51 - (studioWISH[i].length() + String.valueOf(hrg_stdWISH[i]).length() + 27))+"|");
        System.out.println("|==================================================|");
        }
        System.out.print(  "|Pilih nomor studio: ");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioWISH.length) 
        {
        studioInput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==================================================|");
        System.out.println(  "|        Studio yang Anda pilih: " + studioWISH[studioInput]+spaces(51 - (studioWISH[studioInput].length() + 33))+"|");
        System.out.println("|==================================================|");
        } 
        else 
        {
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");        
        System.out.println("    Nomor studio yang Anda masukkan tidak valid.    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");

    } 
    }
    static void PemilihanStudioTheMarvels(){
        // Pilih Studio
        System.out.println("|==================================================|");
        System.out.println("|           Daftar Studio yang Tersedia            |");
        System.out.println("|==================================================|");
        for (int i = 0; i < studioTheMarvels.length; i++) 
        {
        System.out.println(  "|             " + (i + 1) + ". " + studioTheMarvels[i] + " (Harga: " + hrg_stdTheMarvels[i]+")" + spaces(51 - (studioTheMarvels[i].length() + String.valueOf(hrg_stdTheMarvels[i]).length() + 27))+"|");
        System.out.println("|==================================================|");
        }
        System.out.print(  "|             Pilih nomor studio: ");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioTheMarvels.length) 
        {
        studioInput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==================================================|");
        System.out.println(  "|        Studio yang Anda pilih: " + studioTheMarvels[studioInput] + spaces(51 - (studioTheMarvels[studioInput].length() + 33))+ "|");
        System.out.println("|==================================================|");
        } 
        else 
        {
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");        
        System.out.println("    Nomor studio yang Anda masukkan tidak valid.    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");
        }
    }
    static void PemilihanStudioNapoleon(){
        // Pilih 
        System.out.println("|==================================================|");
        System.out.println("|            Daftar Studio yang Tersedia:          |");
        System.out.println("|==================================================|");
        for (int i = 0; i < studioNapoleon.length; i++) 
        {
        System.out.println(  "|             " + (i + 1) + ". " + studioNapoleon[i] + " (Harga: " + hrg_stdNapoleon[i]+")" + spaces(51 - (studioNapoleon[i].length() + String.valueOf(hrg_stdWISH[i]).length() + 27))+"|");
        System.out.println("|==================================================|");
        }
        System.out.print("|Pilih nomor studio: ");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioNapoleon.length) 
        {
        studioInput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==================================================|");
        System.out.println(  "|        Studio yang Anda pilih: " + studioNapoleon[studioInput] + spaces(51 - (studioNapoleon[studioInput].length() + 33))+ "|");
        System.out.println("|==================================================|");
        } 
        else 
        {
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");        
        System.out.println("    Nomor studio yang Anda masukkan tidak valid.    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");
        }
    }
    static void PemilihanKursiStudioDeluxeWish(){
        System.out.println("____________________________________________________");
        System.out.println("|Studio         |      LAYAR      |                |");
        System.out.println("|Deluxe         ===================                |");
        System.out.println("|                                                  |");
        for (int i = 0; i < 5; i++) {
            char barisHuruf = (char) ('A' + i);
            System.out.print("|      ");
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(" [" + StudioDeluxeWish[i][j] + "]    ");
            }
            System.out.println("  |"  + barisHuruf + "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|_______|1|_____|2|_____|3|_____|4|_____|5|________|");
        System.out.println("|==================================================|");
        System.out.println("|    Silahkan memilih Kursi untuk Studio Deluxe:   |");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");        
                isPemilihanDibatalkan = true;
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioDeluxeWish[baris - 1][kolom - 1] == '0') 
                {
                    StudioDeluxeWish[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");

                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
        }
    }
    static void PemilihanKursiStudioIMAXTheMarvels(){
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
        System.out.println("|==================================================|");
        System.out.println("|    Silahkan memilih Kursi untuk Studio IMAX:     |");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");
                isPemilihanDibatalkan = true;            
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioIMAXTheMarvels[baris - 1][kolom - 1] == '0') 
                {
                    StudioIMAXTheMarvels[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
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
        System.out.println("|==================================================|");
        System.out.println("|    Silahkan memilih Kursi untuk Studio Deluxe:   |");
        for (int i = 0; i < jumlahTiket; i++)
        {   
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");
                isPemilihanDibatalkan = true;             
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioDeluxeTheMarvels[baris - 1][kolom - 1] == '0') 
                {
                    StudioDeluxeTheMarvels[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
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
        System.out.println("|==================================================|");
        System.out.println("| Silahkan memilih Kursi untuk Studio The Premiere:|");        
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");
                isPemilihanDibatalkan = true;                
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioThePremiereNapoleon[baris - 1][kolom - 1] == '0') 
                {
                    StudioThePremiereNapoleon[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
        }
    }
    static void PemilihanJumlahTiket() {
    
        System.out.print("    Masukkan jumlah tiket yang ingin dipesan: ");

        jumlahTiket = inputUntukPilihKursi.nextInt();
        if (jumlahTiket > 25) {
            System.out.println("Kursi di dalam studio hanya berjumlah 25");
            PemilihanJumlahTiket();
        }
        else if (jumlahTiket <= 0)
        {
            System.out.println("                                                    ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("               Jumlah tiket tidak valid.");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("                                                    ");
            PemilihanJumlahTiket();
        }
        else 
        {}
        System.out.println(("|==================================================|"));
    }
//=======================================================================================================//
//===========================                 BAHASA INGGRIS              ===============================//
//=======================================================================================================//
    static void MainEnglish(){
        boolean programRunning = true;
        while (programRunning) {
            System.out.println("|==================================================|");
            System.out.println("|                     Main Menu                    |");
            System.out.println("|==================================================|");
            System.out.println("|                1. Login as Cashier               |");
            System.out.println("|                2. Login as Admin                 |");
            System.out.println("|                3. Back to Language Selection     |");
            System.out.println("|==================================================|");

            System.out.print(  "|                   Select Option: ");
            int menuUtamaChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (menuUtamaChoice) {
                case 1:
                    loginKasirEng();
                    break;
                case 2:
                    loginAdminEng();
                    break;
                case 3:
                    programRunning = false;
                    System.out.println("End Program.");
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("         Invalid choice. Please try again.          ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }        
    }
    static void loginKasirEng() {
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("|         - Select an option to continue -         |");
            System.out.println("|==================================================|");
            System.out.println("|            1. Continue as Cashier                |");
            System.out.println("|            2. Back to Main Menu                  |");
            System.out.println("|==================================================|");
            System.out.print(  "|                   Pilih opsi: ");
            int exitChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (exitChoice) {
                case 1:
                    isLoggedIn = validateLoginAsKasirEng();
                    if (isLoggedIn) {
                        processKasirMenuEng();
                    }
                    break;
                case 2:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }
    }
    static void processKasirMenuEng() {
        boolean isLoggedIn = true; // Tambahkan variabel untuk status login
    
        while (isLoggedIn) {
            System.out.println("|                     Menu Kasir                   |");
            System.out.println("|==================================================|");
            System.out.println("|                 1. Pemesanan Tiket               |");
            System.out.println("|                 2. Logout                        |");
            System.out.println("|==================================================|");
    
            System.out.print(  "|                    Pilih opsi: ");
            int menuChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (menuChoice) {
                case 1:
                    isPemilihanDibatalkan = false;
                    PemilihanFILMEng();
                    filmTerpilih = jdl_film[jdlinput];
    
                    if (filmTerpilih.equalsIgnoreCase("WISH")) {
                        PemilihanStudioWishEng();
                        if (studioInput == 0) {
                            PemilihanJumlahTiketEng();
                            PemilihanKursiStudioDeluxeWishEng();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasanEng();
                                prosesPembayaranEng();
                            }
                        }
                    } else if (filmTerpilih.equalsIgnoreCase("The Marvels")) {
                        PemilihanStudioTheMarvelsEng();
                        if (studioInput == 0) {
                            PemilihanJumlahTiketEng();
                            PemilihanKursiStudioDeluxeTheMarvelsEng();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasanEng();
                                prosesPembayaranEng();
                            }
                        } else if (studioInput == 1) {
                            PemilihanJumlahTiketEng();
                            PemilihanKursiStudioIMAXTheMarvelsEng();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasanEng();
                                prosesPembayaranEng();
                            }
                        }
                    } else if (filmTerpilih.equalsIgnoreCase("Napoleon")) {
                        PemilihanStudioNapoleonEng();
                        if (studioInput == 0) {
                            PemilihanJumlahTiketEng();
                            PemilihanKursiStudioThePremiereNapoleonEng();
                            if (!isPemilihanDibatalkan) {
                                tampilkanRingkasanEng();
                                prosesPembayaranEng();
                            }
                        }
                    }
                    break;
    
                case 2:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                   Logout " + loggedInUser + "                    " );
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    isLoggedIn = false; // Set status login menjadi false
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.     ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");

                    break;
            }
        }
        // Setelah keluar dari loop, status login kasir direset
        isLoggedIn = false;
    }
    static boolean validateLoginAsKasirEng() {
        Scanner inputUser = new Scanner(System.in);
        String username, password;
    
        System.out.print("|    Masukkan nama pengguna: ");
        username = inputUser.nextLine();  // Gunakan inputUser di sini
        System.out.println("|==================================================|");
        System.out.print("|    Masukkan kata sandi: ");
        password = inputUser.nextLine();  // Juga gunakan inputUser di sini
        System.out.println("|==================================================|");
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                loggedInUser = username; // Set pengguna yang sedang login
                System.out.println("|             Selamat datang, " + loggedInUser + "!              |");
                System.out.println("|==================================================|");
                return true; // Login sukses
            }
        }
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("            Login gagal, Periksa Kembali!           ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");

        return false; // Login gagal
    }
//======================================================================================//
    static void loginAdminEng(){
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("|            Pilih opsi untuk melanjutkan!         |");
            System.out.println("|==================================================|");
            System.out.println("|            1. Lanjut Sebagai Admin               |");
            System.out.println("|            2. Kembali ke Menu Utama              |");
            System.out.println("|==================================================|");
            System.out.print(  "|            Pilih opsi: ");
            int exitChoice = input.nextInt();
            System.out.println("|==================================================|");
            switch (exitChoice) {
                case 1:
                    isLoggedIn = validateLoginAsAdminEng();
                    if (isLoggedIn) {
                        processAdminMenuEng();
                    }
                    break;
                case 2:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("       Pilihan tidak valid. Silakan pilih lagi.     ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                    ");
                    break;
            }
        }
    }
    static boolean validateLoginAsAdminEng() {
        Scanner inputUser = new Scanner(System.in);
        String username, password;

        System.out.print("|          Masukkan nama pengguna: ");
        username = inputUser.nextLine();  // Gunakan inputUser di sini
        System.out.println("|==================================================|");

    
        System.out.print("|          Masukkan kata sandi: ");
        password = inputUser.nextLine();  // Juga gunakan inputUser di sini
    
        for (int i = 0; i < usernames.length; i++) {
            if (userAdmin[i].equals(username) && passAdmin[i].equals(password)) {
                loggedInUser = username; // Set pengguna yang sedang login
                System.out.println("|               Selamat datang, " + loggedInUser + "!             |");
                System.out.println("|==================================================|");
                return true; // Login sukses
            }
        }
        System.out.println("|           Login gagal, Periksa Kembali!          |");
        System.out.println("|==================================================|");
        return false; // Login gagal
    }
    static void processAdminMenuEng(){
        
        boolean isLoggedIn = true;

        while (isLoggedIn) {
            System.out.println("                                                    ");
            System.out.println("|==================================================|");
            System.out.println("|                      Menu:                       |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("| 1. Tampilkan History Transaksi Kasir             |");
            System.out.println("| 2. Tampilkan History Transaksi Keseluruhan       |");
            System.out.println("| 3. Logout                                        |");
            System.out.println("|--------------------------------------------------|");

            System.out.print("| Pilih opsi: ");
            int menuChoice = input.nextInt();

            switch (menuChoice) {
                case 1:
                    tampilkanHistoryTransaksiEng();                            
                    break;
                case 2:
                    tampilkanHistoryTransaksiAllEng();
                    break;                          

                case 3:
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                   Logout " + loggedInUser + "                    " );
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    isLoggedIn = false; // Set status login menjadi false
                    break;
                default:
                    System.out.println("                                                    ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("      Pilihan tidak valid. Silakan pilih lagi.     ");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("                                                   ");
                    break;
            }
        }  
    }
    static void tampilkanRingkasanEng() 
    {
        System.out.println("                                                    ");
        System.out.println("|==================================================|");
        System.out.println("|               - Ringkasan Pemesanan -            |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                Film: " + filmTerpilih + spaces(50 - (String.valueOf(filmTerpilih).length() + 22)) + "|");
        System.out.println("|                Studio: " + getStudioTerpilih() + spaces(50 - (getStudioTerpilih().length() + 24)) + "|");
        System.out.println("|                Jumlah Tiket: " + jumlahTiket + spaces(50 - (String.valueOf(jumlahTiket).length() + 30)) + "|");
        System.out.println("|                Pilihan Kursi:                    |");
        for (int i = 0; i < indexKursiTerpilih; i++)
        {
            System.out.println(kursiTerpilih[i]);
        }
        System.out.println("|==================================================|");
        kursiTerpilih = new String[25]; // Reset array kursiTerpilih
        indexKursiTerpilih = 0; //Reset index kursi
    }    
    static void prosesPembayaranEng() 
    {
        System.out.println("                                                    ");
        System.out.println("|==================================================|");
        System.out.println("|                - Proses Pembayaran -             |");
        System.out.println("|--------------------------------------------------|");
        System.out.println(  "|                Total Harga: " + hitungTotalHarga());
        if (loggedInUser.equals("kasir1")) {
            historyJumlahTiketKasir1[indexHistoryKasir1] = jumlahTiket;
            historyPendapatanKasir1[indexHistoryKasir1] = hitungTotalHarga();
            indexHistoryKasir1++;
        } else if (loggedInUser.equals("kasir2")) {
            historyJumlahTiketKasir2[indexHistoryKasir2] = jumlahTiket;
            historyPendapatanKasir2[indexHistoryKasir2] = hitungTotalHarga();
            indexHistoryKasir2++;
        }
        //logika untuk merekam history transaksi secara keseluruhan
        historyFilm[indexHistory] = filmTerpilih;
        historyStudio[indexHistory] = getStudioTerpilih();
        historyJumlahTiket[indexHistory] = jumlahTiket;
        historyPendapatan[indexHistory] = hitungTotalHarga();
        indexHistory++;
        
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                Pilih metode pembayaran:          |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                1. Tunai                          |");
        System.out.println("|                2. Kartu Kredit                   |");
        System.out.println("|==================================================|");
        int metodePembayaran = input.nextInt();
        if (metodePembayaran == 1) 
        {
            System.out.println("|==================================================|");
            System.out.println("|    Pembayaran berhasil. Tiket telah terpesan!    |");
            System.out.println("|==================================================|");
            System.out.println("                                                    ");

        } 
        else if (metodePembayaran == 2) 
        {
            System.out.println("|==================================================|");
            System.out.println("|           Masukkan nomor kartu kredit:           |");
            String nomorKartuKredit = input.next();
            System.out.println("|==================================================|");
            System.out.println("|    Pembayaran berhasil. Tiket telah terpesan!    |");
            System.out.println("|==================================================|");
        } 
        else 
        {
            System.out.println("                                                    ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("           Metode pembayaran tidak valid.           ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("                                                    ");

        }
    }
    static void tampilkanHistoryTransaksiEng() {
        System.out.println("                                                    ");
        System.out.println("|==================================================|");
        System.out.println("|               - History Transaksi -              |");
        System.out.println("|==================================================|");
        System.out.println("| Kasir 1:                                         |");
    
        for (int i = 0; i < indexHistoryKasir1; i++) {
            System.out.println("| > Transaksi " + (i + 1) + ": Jumlah Tiket = " + historyJumlahTiketKasir1[i] +
                    spaces(51 - (String.valueOf(historyJumlahTiketKasir1[i]).length()+32)) + "|");
            System.out.println("|                Pendapatan = " + historyPendapatanKasir1[i] +
                    spaces(51 - (String.valueOf(historyPendapatanKasir1[i]).length()+30)) + "|");
            System.out.println("|" + spaces(50) + "|");
        }
        System.out.println("|--------------------------------------------------|");
        System.out.println("| Kasir 2:                                         |");
        for (int i = 0; i < indexHistoryKasir2; i++) {
            System.out.println("| > Transaksi " + (i + 1) + ": Jumlah Tiket = " + historyJumlahTiketKasir2[i] +
                    spaces(51 - (String.valueOf(historyJumlahTiketKasir2[i]).length()+32)) + "|");
            System.out.println("|                Pendapatan = " + historyPendapatanKasir2[i] +
                    spaces(51 - (String.valueOf(historyPendapatanKasir2[i]).length()+30)) + "|");
          System.out.println("|" + spaces(50) + "|");
        }
        System.out.println("|==================================================|");
    }    
    static void tampilkanHistoryTransaksiAllEng() {
        System.out.println("|==================================================|");
        System.out.println("|               - History Transaksi -              |");
        System.out.println("|==================================================|");
    
        for (int i = 0; i < indexHistory; i++) {
            System.out.println("| > Transaksi " + (i + 1) + ": Film = " + historyFilm[i] +
                    spaces(50 - (historyFilm[i].length() + 23)) +
                    "|");
            System.out.println("|                Studio = " + historyStudio[i] +
                    spaces(50 - (historyStudio[i].length() + 25)) +
                    "|");
            System.out.println("|                Jumlah Tiket = " + historyJumlahTiket[i] +
                    spaces(50 - (String.valueOf(historyJumlahTiket[i]).length() + 31)) +
                    "|");
            System.out.println("|                Pendapatan = " + historyPendapatan[i] +
                    spaces(50 - (String.valueOf(historyPendapatan[i]).length() + 29)) +
                    "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|==================================================|");
    }    
    static void PemilihanFILMEng() {
        // Pilih Film
        System.out.println("|==================================================|");
        System.out.println("|              Daftar Film yang Tersedia:          |");
        System.out.println("|==================================================|");
        for (int i = 0; i < jdl_film.length; i++) {
            System.out.println("|              " + (i + 1) + ". " + jdl_film[i] + spaces(51 - (jdl_film[i].length() + 18)) + "|");
        }
        do {
            System.out.println("|==================================================|");
            System.out.print("|   Pilih nomor film yang ingin Anda tonton: ");
            jdlinput = inputUntukJdlFilm.nextInt();

            if (jdlinput >= 1 && jdlinput <= jdl_film.length) {
                jdlinput--; // Mengurangi 1 karena array dimulai dari 0
                System.out.println("|    Film yang Anda pilih: " + jdl_film[jdlinput] + spaces(51 - (jdl_film[jdlinput].length() + 27)) + "|");
                return;
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("      Nomor film yang Anda masukkan tidak valid.    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("                                                    ");
            }
        } while (jdlinput < 1 || jdlinput > jdl_film.length);
    }

    static void PemilihanStudioWishEng(){
        // Pilih Studio
        System.out.println("|==================================================|");
        System.out.println("|            Daftar Studio yang Tersedia:          |");
        System.out.println("|==================================================|");
        for (int i = 0; i < studioWISH.length; i++) {
        System.out.println(  "|             " + (i + 1) + ". " + studioWISH[i] + " (Harga: " + hrg_stdWISH[i]+")" + spaces(51 - (studioWISH[i].length() + String.valueOf(hrg_stdWISH[i]).length() + 27))+"|");
        System.out.println("|==================================================|");
        }
        System.out.print(  "|Pilih nomor studio: ");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioWISH.length) 
        {
        studioInput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==================================================|");
        System.out.println(  "|        Studio yang Anda pilih: " + studioWISH[studioInput]+spaces(51 - (studioWISH[studioInput].length() + 33))+"|");
        System.out.println("|==================================================|");
        } 
        else 
        {
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");        
        System.out.println("    Nomor studio yang Anda masukkan tidak valid.    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");

    } 
    }
    static void PemilihanStudioTheMarvelsEng(){
        // Pilih Studio
        System.out.println("|==================================================|");
        System.out.println("|           Daftar Studio yang Tersedia            |");
        System.out.println("|==================================================|");
        for (int i = 0; i < studioTheMarvels.length; i++) 
        {
        System.out.println(  "|             " + (i + 1) + ". " + studioTheMarvels[i] + " (Harga: " + hrg_stdTheMarvels[i]+")" + spaces(51 - (studioTheMarvels[i].length() + String.valueOf(hrg_stdTheMarvels[i]).length() + 27))+"|");
        System.out.println("|==================================================|");
        }
        System.out.print(  "|             Pilih nomor studio: ");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioTheMarvels.length) 
        {
        studioInput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==================================================|");
        System.out.println(  "|        Studio yang Anda pilih: " + studioTheMarvels[studioInput] + spaces(51 - (studioTheMarvels[studioInput].length() + 33))+ "|");
        System.out.println("|==================================================|");
        } 
        else 
        {
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");        
        System.out.println("    Nomor studio yang Anda masukkan tidak valid.    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");
        }
    }
    static void PemilihanStudioNapoleonEng(){
        // Pilih 
        System.out.println("|==================================================|");
        System.out.println("|            Daftar Studio yang Tersedia:          |");
        System.out.println("|==================================================|");
        for (int i = 0; i < studioNapoleon.length; i++) 
        {
        System.out.println(  "|             " + (i + 1) + ". " + studioNapoleon[i] + " (Harga: " + hrg_stdNapoleon[i]+")" + spaces(51 - (studioNapoleon[i].length() + String.valueOf(hrg_stdWISH[i]).length() + 27))+"|");
        System.out.println("|==================================================|");
        }
        System.out.print("|Pilih nomor studio: ");
        studioInput = inputUntukStudio.nextInt();
        if (studioInput >= 1 && studioInput <= studioNapoleon.length) 
        {
        studioInput--; // Mengurangi 1 karena array dimulai dari 0
        System.out.println("|==================================================|");
        System.out.println(  "|        Studio yang Anda pilih: " + studioNapoleon[studioInput] + spaces(51 - (studioNapoleon[studioInput].length() + 33))+ "|");
        System.out.println("|==================================================|");
        } 
        else 
        {
        System.out.println("                                                    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");        
        System.out.println("    Nomor studio yang Anda masukkan tidak valid.    ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("                                                    ");
        }
    }
    static void PemilihanKursiStudioDeluxeWishEng(){
        System.out.println("____________________________________________________");
        System.out.println("|Studio         |      LAYAR      |                |");
        System.out.println("|Deluxe         ===================                |");
        System.out.println("|                                                  |");
        for (int i = 0; i < 5; i++) {
            char barisHuruf = (char) ('A' + i);
            System.out.print("|      ");
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(" [" + StudioDeluxeWish[i][j] + "]    ");
            }
            System.out.println("  |"  + barisHuruf + "|");
            System.out.println("|                                                  |");
        }
        System.out.println("|_______|1|_____|2|_____|3|_____|4|_____|5|________|");
        System.out.println("|==================================================|");
        System.out.println("|    Silahkan memilih Kursi untuk Studio Deluxe:   |");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");        
                isPemilihanDibatalkan = true;
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioDeluxeWish[baris - 1][kolom - 1] == '0') 
                {
                    StudioDeluxeWish[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");

                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
        }
    }
    static void PemilihanKursiStudioIMAXTheMarvelsEng(){
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
        System.out.println("|==================================================|");
        System.out.println("|    Silahkan memilih Kursi untuk Studio IMAX:     |");
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.println("|--------------------------------------------------|");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");
                isPemilihanDibatalkan = true;            
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioIMAXTheMarvels[baris - 1][kolom - 1] == '0') 
                {
                    StudioIMAXTheMarvels[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
        }
    }
    static void PemilihanKursiStudioDeluxeTheMarvelsEng(){
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
        System.out.println("|==================================================|");
        System.out.println("|    Silahkan memilih Kursi untuk Studio Deluxe:   |");
        for (int i = 0; i < jumlahTiket; i++)
        {   
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");
                isPemilihanDibatalkan = true;             
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioDeluxeTheMarvels[baris - 1][kolom - 1] == '0') 
                {
                    StudioDeluxeTheMarvels[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|Kursi sudah terisi, silahkan pilih kursi yang lain|");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println(" Nomor baris/kolom tidak valid, Silahkan coba lagi  ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                Pilihan kursi Anda:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
        }
    }
    static void PemilihanKursiStudioThePremiereNapoleonEng(){
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
        System.out.println("|==================================================|");
        System.out.println("| Silahkan memilih Kursi untuk Studio The Premiere:|");        
        for (int i = 0; i < jumlahTiket; i++)
        {     
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                    Kursi ke-" + (i + 1) + ". " + "                  |");
            System.out.print("|  Pilih kolom Baris (A-E) dan 0 untuk cancel: " );
            char barisHurufInput = inputUntukPilihKursi.next().charAt(0);
            int baris = barisHurufInput - 'A' + 1;
            System.out.print("|  Pilih kolom Kursi (1-5) dan 0 untuk cancel: ");
            int kolom = inputUntukPilihKursi.nextInt();

            if (barisHurufInput == '0' || kolom == 0) 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
                System.out.println("             Pemilihan kursi dibatalkan.            ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");   
                System.out.println("                                                    ");
                isPemilihanDibatalkan = true;                
                break; // Jika pembatalan, keluar dari loop
            } 
            else if (baris >= 1 && baris <= 5 && kolom >= 1 && kolom <= 5) 
            {
                if (StudioThePremiereNapoleon[baris - 1][kolom - 1] == '0') 
                {
                    StudioThePremiereNapoleon[baris - 1][kolom - 1] = 'X'; // Menandai kursi sebagai terisi ('X')
                    kursiTerpilih[indexKursiTerpilih] = "|                (Baris " + barisHurufInput + " - Kolom " + kolom + ")               |";
                    System.out.println("|==================================================|");
                    indexKursiTerpilih++;
                    System.out.println("|     Anda telah memilih kursi Baris " + barisHurufInput + ", Kolom " + kolom + "    |");
                } 
                else 
                {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|      The seat is taken, please pick another      |");
                    i--; // Mengulang input untuk kursi yang sudah terisi
                }
            } 
            else 
            {
                System.out.println("                                                    ");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("The row/column number is not valid. Please try again");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");                
                System.out.println("                                                    ");
                i--; // Mengulang input untuk nomor baris atau kolom yang tidak valid
            }
        }
        if (!isPemilihanDibatalkan) {
            System.out.println("|==================================================|");
            System.out.println("|                 Your seat choices:               |");
            for (int i = 0; i < indexKursiTerpilih; i++) {
                System.out.println(kursiTerpilih[i]);
            }
        }
    }
    static void PemilihanJumlahTiketEng() {
    
        System.out.print("    Masukkan jumlah tiket yang ingin dipesan: ");

        jumlahTiket = inputUntukPilihKursi.nextInt();
        if (jumlahTiket > 25) {
            System.out.println("Kursi di dalam studio hanya berjumlah 25");
            PemilihanJumlahTiket();
        }
        else if (jumlahTiket <= 0)
        {
            System.out.println("                                                    ");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("               Jumlah tiket tidak valid.");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("                                                    ");
            PemilihanJumlahTiket();
        }
        else 
        {}
        System.out.println(("|==================================================|"));
    }
}