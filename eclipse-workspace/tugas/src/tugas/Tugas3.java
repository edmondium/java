package tugas;
import java.util.Scanner;

public class Tugas3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array Gaji per golongan
        int[] gajiPokok = {5000000, 6500000, 9500000};

        // Array persenan lembur
        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        System.out.println("Program penghitung gaji lembur PT. ABD");
        System.out.println("--------------------------------------");

        System.out.println("Masukkan Golongan Karyawan (A/B/C)");
        String golongan = input.nextLine().toUpperCase();

        int indexGaji = -1;
        if (golongan.equals("A")){
            indexGaji = 0;
        } else if (golongan.equals("B")){
            indexGaji = 1;
        } else if (golongan.equals("C")){
            indexGaji = 2;
        } else {
            System.out.println("Golongan tidak valid");
            return;
        }

        int gaji = gajiPokok[indexGaji];
        System.out.println("Gaji Pokok: Rp. " + gaji);

        System.out.println("Masukkan Jumlah Jam Lembur (0 jika tidak lembur)");
        int jamLembur = input.nextInt();

        double tunjanganLembur = 0;
        if (jamLembur > 0) {
            double persen = 0;
            if (jamLembur == 1){
                persen = persenLembur[0];
            } else if (jamLembur == 2) {
                persen = persenLembur[1];
            } else if (jamLembur == 3) {
                persen = persenLembur[2];
            } else if (jamLembur == 4) {
                persen = persenLembur[3];
            } else if (jamLembur >= 5) {
                persen = persenLembur[4];
            }
            tunjanganLembur = gaji * persen;
            System.out.println("Tunjangan Lembur: Rp. " + (int)tunjanganLembur);
        }

        int totalGaji = gaji + (int)tunjanganLembur;
        System.out.println("Total Gaji: Rp. " + totalGaji);

        input.close();
    }
}