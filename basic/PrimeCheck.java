public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29, i;
        boolean isPrime = true;
        for (i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}