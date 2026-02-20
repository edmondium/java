package variabel;

public class VariabelLokalKecepatan {
	public void tambahKecepatan() {
		int cepat = 0;
		System.out.println("Kecepatan awal: " +cepat);
		cepat += 40;
		System.out.println("Penambahan kecepatan: " +cepat);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariabelLokalKecepatan kecepatan = new VariabelLokalKecepatan();
		kecepatan.tambahKecepatan();
	}

}
