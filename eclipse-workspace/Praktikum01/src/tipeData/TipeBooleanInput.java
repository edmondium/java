package tipeData;
//import java.util.Scanner;
import java.util.*;
public class TipeBooleanInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean Kondisi, Status;
		int nilai1, nilai2;
		// Isi variabel nilai1 dan nilai2
		System.out.println("Masukkan Nilai 1 dan Nilai 2");
		System.out.println("----------------------------");
		System.out.print("Nilai 1: ");
		nilai1 = input.nextInt();
		System.out.print("Nilai 2: ");
		nilai2 = input.nextInt();
		Kondisi = nilai1 > nilai2;
		Status = true;
		// Cetak
		System.out.println("Tipe Data Boolean");
		System.out.println("-----------------");
		System.out.println("Nilai 1 > Nillai 2 = " +Kondisi);
		System.out.println("Status = " +Status);
		input.close();
	}

}
