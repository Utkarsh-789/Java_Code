public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18, lcm;
        lcm = (a > b) ? a : b;
        while(true) {
            if(lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is " + lcm);
                break;
            }
            lcm++;
        }
    }
}