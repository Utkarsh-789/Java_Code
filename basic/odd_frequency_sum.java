import java.util.Scanner;

public class OddFrequencySumSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n]; // to mark processed elements

        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // Count frequency manually
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true; // mark duplicate as visited
                    }
                }
                if (count % 2 != 0) {
                    sum += arr[i];
                }
                visited[i] = true; // mark current as visited
            }
        }

        // Output
        System.out.println("Sum of numbers with odd frequency: " + sum);
    }
}
