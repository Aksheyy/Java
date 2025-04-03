package Pattern;

public class Pattern3 {
	public static void patterns(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
		public static void main(String[] args) {
			
			patterns(5);
		}
}
