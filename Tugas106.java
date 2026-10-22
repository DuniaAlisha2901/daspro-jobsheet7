import java.util.Scanner;

public class Tugas106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel dan tipe data
        int hargaTiket = 50000;
        int totalTiketYangTerjual = 0;
        int totalPenjualanTiketSelamaSatuHari = 0;
        int tiket;
        int pembelianPelanggan;
        int persentaseDiskon;
        int totalHarga = 0;


        // Input Data
        System.out.println(" --- Selamat Datang di Program Penghitungan Tiket Bioskop --- ");
        do {
            System.out.println("Masukkan jumlah tiket yang dibeli oleh pelanggan (0 untuk selesai): ");
            pembelianPelanggan = sc.nextInt();
            if (pembelianPelanggan < 0 ) {
                System.out.println("Jumlah Tiket tidak valid! Silahkan Input Ulang");
                continue;
            }
            // Jika input 0, perulangan berhenti
            if (pembelianPelanggan == 0) {
                break;
            }
            // Menentukan Diskon
            if (pembelianPelanggan > 10) {
                persentaseDiskon = 15;
                System.out.println("Mendapat Diskon 15%");    
            } else if (pembelianPelanggan > 4) {
                persentaseDiskon= 10;
                System.out.println("Mendapat Diskon 10%");
            } else{
                persentaseDiskon = 0;  
                System.out.println("Tidak mendapat diskon");
            }
            // Menghitung Total Harga
            tiket = pembelianPelanggan;
            totalHarga = tiket * hargaTiket;
            totalHarga = totalHarga - (totalHarga * persentaseDiskon / 100);

            // Menghitung total penjualan harian
            totalTiketYangTerjual += tiket;
            totalPenjualanTiketSelamaSatuHari += totalHarga;

            // Menampilkan hasil transaksi
            System.out.println("Jumlah tiket: " +tiket);
            System.out.println("Total harga: Rp" + totalHarga);
        } while (true); 

        // Menampilkan total penjualan harian
        System.out.println("==== TOTAL PENJUALAN HARIAN ====");
        System.out.println("Total Tiket Terjual: " + totalTiketYangTerjual);
        System.out.println("Total penjualan: Rp" + totalPenjualanTiketSelamaSatuHari);

        sc.close();
    }
    }

