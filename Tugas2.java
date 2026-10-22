import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi tipe data dan variabel
        int jenis;
        int durasi;
        int total = 0;
        int tarifPerJamMobil = 3000;
        int tarifPerJamMotor = 2000;

        // Input data
        System.out.println("--- PROGRAM PARKIR ---");
        System.out.println("Jenis Kendaraan : 1 = mobil, 2 = motor");
        System.out.println("Masukkan 0 untuk mengakhiri program");
        
        // Proses
        do {
            System.out.println("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            // Kondisi berhenti
            if (jenis == 0) {
                break;
            }
            
            // Menentukan jenis kendaraan
            if (jenis == 1 || jenis == 2) {
                System.out.println("Jenis kendaraan dapat dikenali");
                System.out.println("Masukkan lama parkir: ");
                durasi = sc.nextInt();
            if (durasi <= 0) {
                System.out.println("Lama parkir tidak valid!");
                continue;
            }

            // menentukan durasi parkir
            System.out.println("Masukkan lama parkir kendaraan: ");
            if (jenis == 1) {
                total += durasi * 3000; 
                System.out.println("Biaya Parkir Mobil: Rp " + (durasi * 3000));
            } else if (jenis == 2) {
                total += durasi * 2000;
                System.out.println("Biaya Parkir Motor: Rp" + (durasi * 2000));
            } else{
                System.out.println("Jenis kendaraan tidak valid");
            }
        }
        } while (true);
        
        // Menampilkan total pendapatan parkir
        System.out.println("=== TOTAL PEMBAYARAN PARKIR ===");
        System.out.println("Total pendapatan parkir: Rp" + total);
    }
}
