package operator;

public class OperatorRelasional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3;
		String x = "Relasional", y = "relasional";
		int ar[] = {1, 2, 3};
		int br[] = {1, 2, 3};
		boolean kondisi = true;
		// Penggunaan operator relasional
		System.out.println("Penggunaan operator relasional");
		System.out.println("------------------------------");
		System.out.println("a = a\t: " +(a == a));
		System.out.println("a = b\t: " +(a == b));
		System.out.println("a < b\t: " +(a < b));
		System.out.println("a <= b\t: " +(a <= b));
		System.out.println("a > b\t: " +(a > b));
		System.out.println("a >= b\t: " +(a >= b));
		System.out.println("a != b\t: " +(a != b));
		/** Untuk array tidak bisa dibandingkan
		 * menggunakan operator relasional
		 * nilai akan menghasilkan false
		 */
		System.out.println("x = y\t: " +(ar == br));
		System.out.println("Kondisi = true\t: " +(kondisi == true));
		System.out.println("Keterangan:\na = 2 dan b = 3");
		System.out.println("x = 'Relasional' dan y = 'relasional'");
	}

}
