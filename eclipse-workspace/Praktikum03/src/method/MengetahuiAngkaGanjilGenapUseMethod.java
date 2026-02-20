package method;
import java.util.*;
public class MengetahuiAngkaGanjilGenapUseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		System.out.print("Masukkan angka: ");
		x = input.nextInt();
			System.out.println("Angka " +x+ " adalah " +menentukanAngkaGanjilGenap(x));
		input.close();
	}
	// Method baru
	public static String menentukanAngkaGanjilGenap(int x) {
		int y;
		y = x % 2;
		if (y == 1) {
			return "Ganjil";
		} else {
			return "Genap";
		}
	}
}