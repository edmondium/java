package method;

public class PemanggilanMethodTanpaReturnValue {
	public static void cariNilaiGanjilGenap(int nilai) {
		nilai %= 2;
		if (nilai == 1) {
			System.out.println("Nilai ganjil");
		} else {
			System.out.println("Nilai genap");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cariNilaiGanjilGenap(2);
		cariNilaiGanjilGenap(3);
		cariNilaiGanjilGenap(16);
	}

}
