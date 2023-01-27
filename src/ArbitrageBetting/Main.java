package ArbitrageBetting;

public class Main {

	public static void main(String[] args) {
		Calculator test = new Calculator("Betonline", "Bovada", "N/A", "N/A", 100);
		
		System.out.println(test.calculate(2, 2.2, 100));

	}
}
