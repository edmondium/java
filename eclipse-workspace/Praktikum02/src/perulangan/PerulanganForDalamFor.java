package perulangan;

public class PerulanganForDalamFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For bersarang");
		System.out.println("-------------");
		for (int i = 1; i <= 10; i++) {
			System.out.println("*");
		}
		System.out.println("\nFor bersarang dalam for");
		System.out.println("-------------------------");
		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
