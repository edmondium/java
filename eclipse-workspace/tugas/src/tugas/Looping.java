package tugas;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String ulang = "Y";
		do {
			System.out.print("Hitung ulang? (Y/N)\t: ");
			ulang = scanner.next().toUpperCase();
		} while (ulang.equals("Y"));
		System.out.println("Program selesai. Terima kasih.");
		scanner.close();
	}

}
