package tugas;
import java.util.*;
import java.text.*;
public class ArrayGaji {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Object [][] dataGolongan = {
				{'A', 5_000_000},
				{'B', 6_500_000},
				{'C', 9_500_000}
		};
		Locale Indonesia = Locale.forLanguageTag("id-ID");
		NumberFormat rupiah = NumberFormat.getCurrencyInstance(Indonesia);
		for (; ; ) {
			System.out.print("Masukkan golongan karyawan (A/B/C): ");
			String golonganInput = input.nextLine().toUpperCase().trim();    // ini budi = inibudi
			if (golonganInput.length() != 1) {                               // a0 = 2 karakter, 03 = 2 karakter
				System.out.println("Input golongan tidak valid!");
				continue;
			}
			char golongan = golonganInput.charAt(0);
			int gajiPokok = 0;
			for (int i = 0; i < dataGolongan.length; i++) {
				if ((char)dataGolongan[i][0] == golongan) {
					gajiPokok = (int)dataGolongan[i][1];
					break;
				}
			}
			if (gajiPokok == 0) {
				System.out.println("Golongan tidak valid!");
				continue;
			}
			System.out.println("Rincian Gaji");
			System.out.println("------------");
			System.out.println("Golongan: " +golongan);
			System.out.println("Gaji Pokok: " +rupiah.format(gajiPokok));
			System.out.print("Apakah ingin menghitung lagi? (y/n): ");
			String lanjut = input.nextLine();
			if (!lanjut.equalsIgnoreCase("y")) {
				break;
			}
			System.out.println();
		}
		System.out.println("\nTerima kasih. Program selesai.");
		input.close();
	}

}
