import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows = scanner.nextInt();
        
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            System.out.format("%" + (numRows - i) * 2 + "s", ""); // Adjust spacing
            
            for (int j = 0; j <= i; j++) {
          System.out.format("%4d", number); // Adjust spacing
                number = number * (i - j) / (j + 1);
            }
            
            System.out.println();
        }
    }
}
