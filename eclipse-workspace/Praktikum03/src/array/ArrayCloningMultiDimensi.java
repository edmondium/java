package array;

public class ArrayCloningMultiDimensi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySumber[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int arrayTujuan[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		System.out.println("Dibandingkan sebelum kloning");
		System.out.println("----------------------------");
		System.out.println(arraySumber[0][1] == arrayTujuan[0][1]);
		
		// Proses kloning
		arrayTujuan = arraySumber.clone();
		System.out.println('\n');
		
		System.out.println("Dibandingkan setelah kloning");
		System.out.println("----------------------------");
		System.out.println(arraySumber[0][1] == arrayTujuan[0][1]);
	}

}
