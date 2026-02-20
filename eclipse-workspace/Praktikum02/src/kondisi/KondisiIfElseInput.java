package kondisi;
import java.util.*;
public class KondisiIfElseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int angka = 0;
		System.out.print("Masukkan angka 1-100\t: ");
		// Input nilai ke dalam variabel angka
		angka = input.nextInt();
		// Kondisi if-else
		if (angka > 1 && angka <= 50) {
			System.out.println("Anda tidak lulus");
		} else {
			System.out.println("Anda lulus");
		}
		input.close();
	}

}
