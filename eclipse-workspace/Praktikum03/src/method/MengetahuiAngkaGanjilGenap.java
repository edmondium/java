package method;
import java.util.*;
public class MengetahuiAngkaGanjilGenap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x, y;
		System.out.print("Masukkan angka: ");
		x = input.nextInt();
		y = x % 2;
		if (y == 1) {
			System.out.println("Angka " +x+ " adalah ganjil");
		} else {
			System.out.println("Angka " +x+ " adalah genap");
		}
		input.close();
	}

}
