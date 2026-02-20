package tugas;
import java.util.Scanner; 

public class tugas2{ 
    public static void main(String[] args) { 
    	Scanner input = new Scanner(System.in); 
    	System.out.println("=== PROGRAM HITUNG GAJI KARYAWAN ==="); 
    	System.out.print("Masukkan Golongan (A/B/C): "); 
    	String golongan = input.next().toUpperCase(); 
    	System.out.print("Masukkan Jam Lembur: "); 
    	int jam = input.nextInt(); 
    	double gajiPokok = 0; 
    	double persenLembur = 0; 
    	// Tentukan gaji pokok berdasarkan golongan 
    	if (golongan.equals("A")) { 
    	gajiPokok = 5000000; 
    	} else if (golongan.equals("B")) { 
    	gajiPokok = 6500000; 
    	} else if (golongan.equals("C")) { 
    	gajiPokok = 9500000; 
    	} else { 
    	System.out.println("Golongan tidak valid!"); 
    	return; 
    	} 
    	// Tentukan persentase lembur berdasarkan jam 
    	if (jam == 1) { 
    	persenLembur = 0.30; 
    	} else if (jam == 2) { 
    	persenLembur = 0.32; 
    	} else if (jam == 3) { 
    	persenLembur = 0.34; 
    	} else if (jam == 4) { 
    	persenLembur = 0.36; 
    	} else if (jam >= 5) { 
    	persenLembur = 0.38; 
    	} else { 
    	persenLembur = 0; // tidak lembur 
    	} 
    	double gajiLembur = gajiPokok * persenLembur; 
    	double totalGaji = gajiPokok + gajiLembur; 
    	System.out.println("\n=== HASIL PERHITUNGAN ==="); 
    	System.out.println("Golongan: " + golongan); 
    	System.out.println("Gaji Pokok: Rp " + gajiPokok); 
    	System.out.println("Gaji Lembur: Rp " + gajiLembur); 
    	System.out.println("Total Penghasilan: Rp " + totalGaji); 
    	System.out.println("==========================");
    } 
}