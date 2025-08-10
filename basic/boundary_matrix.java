import java.util.Scanner;

public class BoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter size of matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

        // Input matrix elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate sum of boundary elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check for boundary condition
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        // Output
        System.out.println("Sum of boundary elements: " + sum);
    }
}
