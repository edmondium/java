package eksepsi;

public class EksepsiTryCatchBersarang {
	public static boolean methodTryCatch(int a, int b) {
		boolean nilai = false;
		int jumlahTerjual[] = new int[2];
		jumlahTerjual[0] = 3;
		jumlahTerjual[1] = 4;
		try {
			if (jumlahTerjual[0] > jumlahTerjual[2]) {
				nilai = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Jebak kesalahan dari sub-method");
			System.out.println("Awas! Terjadi kesalahan");
		}
		return nilai;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hasil = false;
		int jumlahSepeda[] = new int[4];
		jumlahSepeda[0] = 3;
		jumlahSepeda[1] = 4;
		jumlahSepeda[2] = 1;
		jumlahSepeda[3] = 3;
		try {
			hasil = methodTryCatch(jumlahSepeda[1], jumlahSepeda[3]);
			System.out.println("Hasil boolean: " +hasil);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Jebak kesalahan dari method utama");
			System.out.println("Awas! Ada kesalahan alamat memori");
		}
	}

}
