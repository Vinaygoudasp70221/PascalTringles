
public class PascalTriangleRecursion {
	public static void main(String[] args) {
		int numRows = 5;
		System.out.println("Pascal's Triangle:");
		printPascalTriangle(numRows);
	}

	private static void printPascalTriangle(int numRows) {
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.printf("%2d", pascalValue(i, j));

			}
			System.out.println();
		}
	}

	private static int pascalValue(int row, int col) {
		if (col == 0 || col == row) {
			return 1;
		} else {
			return pascalValue(row - 1, col - 1) + pascalValue(row - 1, col);
		}
	}
}
