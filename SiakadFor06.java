import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi vatiabel dan tipe data
        double nilai;
        double tertinggi = 0;
        double terendah = 100;

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
        }
        
        // Output program
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
