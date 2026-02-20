package variabel;

public class VariabelStaticSepedaKonstanta {
	/** Variabel hargaSepeda adalah
	 * modifier private dan
	 * variabel static
	 * @param args
	 */
	private static int hargaSepeda;
	// Variabel jenisSepeda konstan
	public static final String jenisSepeda = "Sepeda Gunung";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hargaSepeda = 12_000_000;
		System.out.println(jenisSepeda+ " harganya\t: Rp. " +hargaSepeda);
	}

}
