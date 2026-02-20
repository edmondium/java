package kondisi;
import java.util.*;
public class KondisiSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int angka;
		do {
			System.out.print("Masukkan angka [1-9]\t: ");
			angka = input.nextInt();
			switch (angka) {
			case 1:
				System.out.println("Angka satu");
				break;
			case 2:
				System.out.println("Angka dua");
				break;
			case 3:
				System.out.println("Angka tiga");
				break;
			case 4:
				System.out.println("Angka empat");
				break;
			case 5:
				System.out.println("Angka lima");
				break;
			case 6:
				System.out.println("Angka enam");
				break;
			case 7:
				System.out.println("Angka tujuh");
				break;
			case 8:
				System.out.println("Angka delapan");
				break;
			case 9:
				System.out.println("Angka sembilan");
				break;
			default:
				System.out.println("Anda memilih keluar");;
			}
		} while (angka > 0);
		input.close();
	}

}
