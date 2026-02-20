package method;

public class MethodOverloading {
	// Overloaded string
	public static String tambahData(String datanya) {
		return datanya+ " + empat = delapan";
	}
	
	// Overloaded integer
	public static int tambahData(int panjang, int lebar) {
		return panjang + lebar;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. " +tambahData("Empat"));
		System.out.println("2. 4 + 4 = " +tambahData(4, 4));
	}

}
