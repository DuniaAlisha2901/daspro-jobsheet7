import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi vatiabel dan tipe data
        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;


        // Proses Program
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } 
            if (nilai >= 60) {
                jumlahLulus++;
            }else{
                jumlahTidakLulus++;
            }
        }
        
        // Output program
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa Tidak Lulus " +jumlahTidakLulus);
    sc.close();
    }
}
