package array;

public class ArraySatuDimensiSederhana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayInt;
		
		// Mengalokasikan memori
		arrayInt = new int[5];
		
		arrayInt[0] = 5;
		arrayInt[1] = 7;
		arrayInt[2] = 4;
		arrayInt[3] = 8;
		arrayInt[4] = 9;
		
		System.out.println("Daftar array dalam ArrayInt");
		System.out.println("---------------------------");
		
		// Mengakses data array dengan perulangan for
		int i = 0;
		for (int x : arrayInt) {
			System.out.println("Array pada indeks ke-" + i++ + " : " +x);
		}
	}

}
