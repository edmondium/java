package operator;

public class OperatorLogika {

	public static void main(String[] args) {
		// Operator logika AND
		System.out.println("Operator logika AND");
		System.out.println("-------------------");
		System.out.println("1. true && true\t: " +(true && true));
		System.out.println("2. true && false\t: " +(true && false));
		System.out.println("3. false && false\t: " +(false && false));
		System.out.println("");
		
		// Operator logika OR
		System.out.println("Operator logika OR");
		System.out.println("------------------");
		System.out.println("1. true || true\t: " +(true || true));
		System.out.println("2. true || false\t: " +(true || false));
		System.out.println("3. false || false\t: " +(false || false));
		System.out.println("");
		
		// Operator logika NOT
		System.out.println("Operator logika NOT");
		System.out.println("------------------ ");
		System.out.println("Not true\t: " +!true);
		System.out.println("Not false\t: " +!false);
	}

}
