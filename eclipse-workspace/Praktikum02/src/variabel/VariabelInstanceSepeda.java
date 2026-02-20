package variabel;

public class VariabelInstanceSepeda {
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
	public VariabelInstanceSepeda(String NamaSepeda, int HargaSepeda) {
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
		VariabelInstanceSepeda sepeda = new VariabelInstanceSepeda("Sepeda Gunung", 100_000);
		sepeda.tampilSepeda();
	}

}
