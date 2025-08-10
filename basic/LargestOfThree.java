public class LargestOfThree {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest number is: " + largest);
    }
}