package array;

public class ArrayCloningSatuDimensi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySumber[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int arrayTujuan[] = {10, 12, 13, 14, 15, 16, 17, 18};
		System.out.println("Nilai array sumber");
		System.out.println("------------------");
		for (int i : arraySumber) {
			System.out.print(i+ " ");
		}
		System.out.println('\n');
		System.out.println("Nilai array tujuan sebelum kloning");
		System.out.println("----------------------------------");
		for (int i : arrayTujuan) {
			System.out.print(i+ " ");
		}
		System.out.println('\n');
		System.out.print("Bandingkan arraySumber vs arrayTujuan = ");
		System.out.println(arraySumber[0] == arrayTujuan[0]);
		// Proses kloning
		arrayTujuan = arraySumber.clone();
		System.out.println('\n');
		System.out.println("Nilai array tujuan setelah kloning");
		System.out.println("----------------------------------");
		for (int i : arrayTujuan) {
			System.out.print(i+ " ");
		}
		System.out.println('\n');
		System.out.print("Bandingkan arraySumber vs arrayTujuan = ");
		System.out.println(arraySumber[0] == arrayTujuan[0]);
	}

}
