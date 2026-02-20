package perulangan;
import java.util.*;
public class PerulanganExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Deklarasi variabel angka
		int angka, perulangan = 0;
		do {
			perulangan++;
			System.out.print("Perulangan ke " +perulangan+ ", nilai angka [1-9] atau 0 untuk keluar\t: ");
			angka = input.nextInt();
			if (perulangan == 10) {
				break;
			}
		} while (angka > 0);
		System.out.println("Anda keluar dari perulangan");
		System.out.println("Perulangan selama\t: " +perulangan+ " kali");
		input.close();
	}

}
