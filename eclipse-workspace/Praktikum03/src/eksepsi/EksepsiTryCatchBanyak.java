package eksepsi;

public class EksepsiTryCatchBanyak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sepeda[] = new String[3];
		double pembagian = 0;
		sepeda[0] = "Sepeda santai";
		sepeda[1] = "Sepeda gunung";
		sepeda[2] = "Sepeda balap";
		try {
			pembagian = 10 / 0;
			System.out.println(sepeda[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Eksepsi: Ada indeks array melampaui batas");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Eksepsi: Pembagi tidak boleh 0");
		}
	}

}
