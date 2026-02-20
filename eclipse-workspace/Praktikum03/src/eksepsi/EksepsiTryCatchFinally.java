package eksepsi;

public class EksepsiTryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sepeda[] = new String[4];
		sepeda[0] = "Sepeda santai";
		sepeda[1] = "Sepeda gunung";
		sepeda[2] = "Sepeda balap";
		sepeda[3] = "Sepeda ontel";
		try {
			System.out.println(sepeda[10]);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Awas! Ada kesalahan alamat memori");
		} finally {
			// TODO: handle finally clause
			System.out.println("Tetap dikerjakan");
		}
	}

}
