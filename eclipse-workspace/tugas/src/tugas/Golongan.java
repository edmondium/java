package tugas;

import java.util.Scanner;

public class Golongan{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String ulang = "Y";
		do {
			System.out.print("Masukkan golongan (D/E/F): ");
			String golongan = scanner.next().toUpperCase();
			if (!golongan.equals("D") && !golongan.equals("E") && !golongan.equals("F")) {
				System.out.println("Golongan tidak valid. Silakan masukkan D, E, atau F.");
				continue;
			}
			int gaji;
			switch (golongan) {
			case "D":
				gaji = 10_000_000;
				break;
			case "E":
				gaji = 15_000_000;
				break;
			default:
				gaji = 20_000_000;
			}
			System.out.println("Golongan: " +golongan);
			System.out.println("Gaji\t: Rp. " +String.format("%,d", gaji));
			System.out.print("\nHitung ulang? (Y/N): ");
			ulang = scanner.next().toUpperCase();
		} while (ulang.equals("Y"));
		System.out.println("Program selesai. Terima kasih.");
		scanner.close();
	}

}
