package perulangan;

public class PerulanganWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perulangan = 1;
		System.out.println("Pernyataan While");
		System.out.println("----------------");
		/** Jika kondisi maka blok program
		 * dieksekusi
		 */
		while (perulangan <= 5) {
			System.out.println("Nilai perulangan\t: " +perulangan);
			// Nilai perulangan ditambah 1
			perulangan++;
		}
	}

}
