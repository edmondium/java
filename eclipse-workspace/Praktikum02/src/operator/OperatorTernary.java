package operator;

public class OperatorTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilai = 50;
		String keterangan1, keterangan2;
		// Menggunakan if-else
		if (nilai >= 50) {
			keterangan1 = "Lolos seleksi";
		} else {
			keterangan1 = "Tidak lolos seleksi";
		}
		System.out.println("Hasil dari if-else");
		System.out.println("------------------");
		System.out.println(keterangan1 +'\n');
		
		// Menggunakan ternary
		keterangan2 = (nilai >= 50)? "Lolos seleksi" : "Tidak lolos seleksi";
		System.out.println("Hasil dari Operator Ternary");
		System.out.println("---------------------------");
		System.out.println(keterangan2);
	}

}
