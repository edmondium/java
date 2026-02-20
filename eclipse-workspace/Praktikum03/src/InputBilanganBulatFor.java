import java.util.*;
public class InputBilanganBulatFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int at = 0;
		Scanner input = new Scanner(System.in);
		for (int a = 1; a <= 6; a++) {
			System.out.print("Masukkan nilai a" +a+ ": ");
			a = input.nextInt();
			at += a;
		}
		System.out.println("\nMasukkan nilai at: " +at);
		input.close();
	}

}
