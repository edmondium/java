package array;

public class ArrayDuaDimensi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array2D[][] = {{2, 1, 8},
				{3, 6, 9},
				{1, 7, 4}
		};
		
		System.out.println("Tampilkan array 2D");
		System.out.println("------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array2D[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
