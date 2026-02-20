import java.util.*;
public class InputBilanganBulat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1, a2, a3, a4, a5, a6, at;
		at = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai a1: ");
		a1 = input.nextInt();
		at = at + a1; //at += a1
		
		System.out.print("Masukkan nilai a2: ");
		a2 = input.nextInt();
		at = at + a2;
		
		System.out.print("Masukkan nilai a3: ");
		a3 = input.nextInt();
		at = at + a3;
		
		System.out.print("Masukkan nilai a4: ");
		a4 = input.nextInt();
		at = at + a4;
		
		System.out.print("Masukkan nilai a5: ");
		a5 = input.nextInt();
		at = at + a5;
		
		System.out.print("Masukkan nilai a6: ");
		a6 = input.nextInt();
		at = at + a6;
		
		System.out.println("\nMasukkan nilai at: " +at);
		input.close();
	}

}
