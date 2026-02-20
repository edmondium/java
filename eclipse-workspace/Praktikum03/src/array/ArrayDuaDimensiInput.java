package array;
import java.util.*;
public class ArrayDuaDimensiInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array2D = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Input array 2D");
		System.out.println("--------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Input nilai array[" +i+ "][" +j+ "] = ");
				// Proses input nilai array
				array2D[i][j] = input.nextInt();
			}
			System.out.println();
		}
		System.out.println("Tampilkan array 2D");
		System.out.println("------------------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array2D[i][j]+ " ");
			}
			System.out.println();
		}
		input.close();
	}

}
