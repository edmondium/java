package operator;

public class OperatorLogikaMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilaiA = 25;
		int nilaiB = 40;
		float nilaiC = 40.4f;
		boolean a = nilaiA > nilaiB && nilaiB < nilaiC || nilaiC < nilaiB;
		boolean b = nilaiA < nilaiB || nilaiB < nilaiC && nilaiC < nilaiB;
		boolean c = nilaiA > nilaiB && !(nilaiB < nilaiC);
		// Jika dijalankan
		System.out.println("Nilai dari a\t: " +a);
		System.out.println("Nilai dari b\t: " +b);
		System.out.println("Nilai dari b\t: " +c);
	}

}
