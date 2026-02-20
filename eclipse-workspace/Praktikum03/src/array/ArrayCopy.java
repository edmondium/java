package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arraySumber = {'S', 'e', 'p', 'e', 'd', 'a', ' ', 'S', 'a', 'n', 't', 'a', 'i'};
		char[] arrayTujuan = {'L', 'a', 'g', 'i', ' ', 'C', 'o', 'd', 'i', 'n', 'g'};
		// Cetak array sumber
		System.out.println("Array sumber");
		System.out.println("------------");
		System.out.println(new String(arraySumber));
		
		// Cetak array tujuan sebelum disisip
		System.out.println("\nArray tujuan sebelum disisip");
		System.out.println("------------------------------");
		System.out.println(new String(arrayTujuan));
		
		/** Proses kopi sebagian data array sumber
		 * dan menyisipnya ke array tujuan
		 */
		System.arraycopy(arraySumber, 7, arrayTujuan, 5, 6);
		
		System.out.println("\nArray tujuan setelah disisip");
		System.out.println("------------------------------");
		
		// Cetak array tujuan setelah penyisipan data
		System.out.println(new String(arrayTujuan));
	}
}
