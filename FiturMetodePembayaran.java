import java.util.Scanner;

public class FiturMetodePembayaran {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int lokasi_pembayaran, metode_pembayaran, bayar;
        System.out.println("==========================");
        System.out.println("Dimana anda ingin membayar \na.Bayar di sini \nb.Bayar di kasir");
        System.out.println("==========================");        
        lokasi_pembayaran = input.next().charAt(0);

        if (lokasi_pembayaran == 'a') 
        {
            System.out.println("==========================");
            System.out.println("Pilih Metode Pembayaran \na.E-Wallet \nb.Debit \nc.QRIS \nd.Kembali Bayar di Kasir");
            System.out.println("==========================");
            metode_pembayaran = input.next().charAt(0);

            if (metode_pembayaran == 'a')
            {
                System.out.println("\n\nSelesaikan Transaksi Anda!");
                System.out.println("\n========================\n");
                System.out.println("Apakah Transaksi Anda Sukses? \na.Ya \nb.Tidak");
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
                System.out.println("\n\nSelesaikan Transaksi Anda!");
                System.out.println("\n========================\n");
                System.out.println("Apakah Transaksi Anda Sukses? \na.Ya \nb.Tidak");
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
                System.out.println("\n\nSelesaikan Transaksi Anda!");
                System.out.println("\n========================\n");
                System.out.println("Apakah Transaksi Anda Sukses? \na.Ya \nb.Tidak");
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
    