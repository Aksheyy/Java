

package Pattern;

public class Pattern4 {
	public static void patterns(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
	}
		public static void main(String[] args) {
			
			patterns(5);
		}
}
