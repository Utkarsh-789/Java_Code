import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number a");
        int a=sc.nextInt();
        System.out.println("enter second number b");
        int b=sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
