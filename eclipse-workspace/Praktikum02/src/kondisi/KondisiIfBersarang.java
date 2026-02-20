package kondisi;
import java.util.*;
public class KondisiIfBersarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("If dalam If");
		System.out.println("-----------");
		System.out.print("Masukkan nilai x\t: ");
		x = input.nextInt();
		if (x >= 13) {
			// If pertama
			if (x == 13) {
				System.out.println("Variabel x = 13");
			}
			// If kedua
			if (x <= 14) {
				System.out.println("Variabel x <= 14");
			} else {
				System.out.println("Variabel x > 14");
			}
		} else {
			System.out.println("Nilai x < 13");
		}
		input.close();
	}

}
