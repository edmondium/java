package variabel;
import java.util.*;
public class VariabelInstanceSepedaInput {
	/** Variabel instance ini dapat digunakan oleh
	 * semua subkelas
	 * @param args
	 */
	public String namaSepeda;
	public int hargaSepeda;
	/** Variabel namaSepeda dan hargaSepeda
	 * diinisialisasikan dalam constructor 
	 * @param args
	 */
	public VariabelInstanceSepedaInput(String NamaSepeda, int HargaSepeda) {
		namaSepeda = NamaSepeda;
		hargaSepeda = HargaSepeda;
	}
	// Method ini menampilkan informasi sepeda
	public void tampilSepeda() {
		System.out.println("Nama sepeda: " +namaSepeda);
		System.out.println("Harga sepeda: " +hargaSepeda);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String namaSepeda;
		int hargaSepeda;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nama sepeda dan harga sepeda");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan nama sepeda: ");
		namaSepeda = input.nextLine();
		System.out.print("Masukkan harga sepeda: ");
		hargaSepeda = input.nextInt();
		System.out.print("\n");
		VariabelInstanceSepedaInput sepeda = new VariabelInstanceSepedaInput(namaSepeda, hargaSepeda);
		sepeda.tampilSepeda();
		input.close();
	}

}
