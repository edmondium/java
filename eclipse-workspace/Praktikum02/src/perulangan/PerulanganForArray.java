package perulangan;

public class PerulanganForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Sepeda = {"Gunung", "Santai", "Balap", "Ontel"};
		System.out.println("Cetak Array klasik");
		System.out.println("------------------");
		// Perulangan Array klasik
		for (int i = 0; i < Sepeda.length; i++) {
			System.out.println(Sepeda[i]);			
		}
		
		System.out.println("\nCetak Array modern");
		System.out.println("--------------------");
		// Perulangan Array yang disederhanakan
		for (String nama_sepeda : Sepeda) {
			System.out.println(nama_sepeda);
		}
	}

}
