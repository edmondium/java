package tugas;

import java.util.Scanner;

public class Lembur{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String ulang = "Y";
		do {
			int jamLembur = -1;
			boolean valid = false;
			while (!valid) {
				System.out.print("Masukkan jumlah jam lembur: ");
				String line = scanner.nextLine().trim();
				if (line.contains(" ")) {
					System.out.println("Error: Harap masukkan satu angka, bukan multi-input.");
					continue;
				}
				if (!line.matches("-?\\d+")) {
					System.out.println("Input jam lembur tidak valid. Harap masukkan angka integer.");
					continue;
				}
				jamLembur = Integer.parseInt(line);
				if (jamLembur < 0) {
					System.out.println("Jumlah jam lembur tidak valid. Tidak dapat berupa nilai negatif");
					continue;
				}
				valid = true;
			}
			
			
			double persentase;
			switch (jamLembur) {
			case 0:
				persentase = 0.0;
				break;
			case 1:
				persentase = 30.0/100.0;
				break;
			case 2:
				persentase = 32.0/100.0;
				break;
			case 3:
				persentase = 34.0/100.0;
				break;
			case 4:
				persentase = 36.0/100.0;
				break;
			default:
				persentase = 38.0/100.0;
			}
			System.out.println("Jam lembur: " +jamLembur+ " jam");
			System.out.println("Persentase lembur: " +(persentase*100)+ "%");
			System.out.print("\nHitung ulang? (Y/N): ");
			ulang = scanner.nextLine().trim().toUpperCase();
		} while (ulang.equals("Y"));
		System.out.println("Program selesai. Terima kasih.");
		scanner.close();
	}

}
