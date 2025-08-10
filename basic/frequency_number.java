import java.util.Scanner;

public class MaxFrequencySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count frequency
        int maxFreq = 0;
        int maxNum = arr[0];

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > maxFreq) {
                maxFreq = count;
                maxNum = arr[i];
            }
        }

        // Output
        System.out.println("Number with maximum frequency: " + maxNum);
        System.out.println("It appears " + maxFreq + " times.");
    }
}
