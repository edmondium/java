package sepeda;
import paketSepeda.*;
public class Sepeda {
	public static void main(String[] args) {
		System.out.println("Jenis Sepeda");
		System.out.println("------------");
		/** Memanggil class/method dalam package
		 * dengan cara membuat objek baru untuk
		 * setiap class
		 */
		sepedaGunung sepeda1 = new sepedaGunung();
		sepeda1.sepedaGunung();
		sepedaSantai sepeda2 = new sepedaSantai();
		sepeda2.sepedaSantai();
	}
}
