import java.util.Scanner;

public class FiturMetodePembayaran {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int lokasi_pembayaran, metode_pembayaran, bayar;
        System.out.println("|============================|");
        System.out.println("| Dimana anda ingin membayar |");
        System.out.println("|============================|");
        System.out.println("| a.Bayar di sini            |");      
        System.out.println("| b.Bayar di kasir           |");
        System.out.println("|============================|");
        System.out.print("Pilih a/b untuk melanjutkan : ");
  
        lokasi_pembayaran = input.next().charAt(0);

        if (lokasi_pembayaran == 'a') 
        {
            System.out.println("|==========================|");
            System.out.println("| Pilih Metode Pembayaran  |");
            System.out.println("|==========================|");
            System.out.println("| a.E-Wallet               |");
            System.out.println("| b.Debit                  |");
            System.out.println("| c.QRIS                   |");
            System.out.println("| d.Kembali Bayar di Kasir |");
            System.out.println("|==========================|");
	        System.out.println("Pilih a/b/c/d untuk melanjutkan");
            metode_pembayaran = input.next().charAt(0);

            if (metode_pembayaran == 'a')
            {
                System.out.println("...");
                System.out.println("Selesaikan Transaksi Anda!");
                System.out.println("...");
                System.out.println("|===============================|");
                System.out.println("| Apakah Transaksi Anda Sukses? |");
                System.out.println("|===============================|");
                System.out.println("| a.Ya                          |");
                System.out.println("| b.Tidak                       |");
                System.out.println("|===============================|");
                bayar = input.next().charAt(0);
                if (bayar == 'a')
                {
                    System.out.println("Transaksi Anda Berhasil, Terimakasih dan Selamat Menikmati Tayangan Film");
                }
                else if (bayar == 'b')
                {
                    System.out.println("Harap ulangi Transaksi Anda!");
                }
                else 
                {
                    System.out.println("Terjadi Kesalahan");
                }
            }
            else if (metode_pembayaran == 'b') 
            {
                System.out.println("...");
                System.out.println("Selesaikan Transaksi Anda!");
                System.out.println("...");
                System.out.println("|===============================|");
                System.out.println("| Apakah Transaksi Anda Sukses? |");
                System.out.println("|===============================|");
                System.out.println("| a.Ya                          |");
                System.out.println("| b.Tidak                       |");
                System.out.println("|===============================|");
                bayar = input.next().charAt(0);
                if (bayar == 'a')
                {
                    System.out.println("Transaksi Anda Berhasil, Terimakasih dan Selamat Menikmati Tayangan Film");
                }
                else if (bayar == 'b')
                {
                    System.out.println("Harap ulangi Transaksi Anda!");
                }
                else 
                {
                    System.out.println("Terjadi Kesalahan");
                }
            }
            else if (metode_pembayaran == 'c') 
            {
                System.out.println("...");
                System.out.println("Selesaikan Transaksi Anda!");
                System.out.println("...");
                System.out.println("|===============================|");
                System.out.println("| Apakah Transaksi Anda Sukses? |");
                System.out.println("|===============================|");
                System.out.println("| a.Ya                          |");
                System.out.println("| b.Tidak                       |");
                System.out.println("|===============================|");
                bayar = input.next().charAt(0);
                if (bayar == 'a')
                {
                    System.out.println("Transaksi Anda Berhasil, Terimakasih dan Selamat Menikmati Tayangan Film");
                }
                else if (bayar == 'b')
                {
                    System.out.println("Harap ulangi Transaksi Anda!");
                }
                else 
                {
                    System.out.println("Terjadi Kesalahan");
                }
            }
            else if (metode_pembayaran == 'd') 
            {
                System.out.println("Selesaikan Transaksi di kasir");
            }
            else
            {
                System.out.println("Anda Salah Memasukan input");
            }
        }
        else if (lokasi_pembayaran == 'b')
        {
            System.out.println("Selesaikan Transaksi di kasir");
        }
        else 
        {
            System.out.println("Anda Salah Memasukan input");
        }
    }
}
    