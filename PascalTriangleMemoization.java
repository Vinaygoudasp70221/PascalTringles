
import java.util.HashMap;
import java.util.Map;

public class PascalTriangleMemoization {
    private static Map<Integer, Map<Integer, Integer>> memo = new HashMap<>();

    public static void main(String[] args) {
        int numRows = 5; // Number of rows for Pascal's triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                int coefficient = calculateCoefficient(i, j);
                System.out.printf(coefficient + " ");
            }
            System.out.println();
        }
    }

    private static int calculateCoefficient(int row, int column) {
        if (column == 0 || row == column) {
            return 1;
        }

        if (memo.containsKey(row) && memo.get(row).containsKey(column)) {
            return memo.get(row).get(column);
        }

        int coefficient = calculateCoefficient(row - 1, column - 1) + calculateCoefficient(row - 1, column);

        memo.putIfAbsent(row, new HashMap<>());
        memo.get(row).put(column, coefficient);

        return coefficient;
    }
}

