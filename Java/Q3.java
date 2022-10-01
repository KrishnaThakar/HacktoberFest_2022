import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n = input.nextInt();
        System.out.print("Enter second number: ");
        int m = input.nextInt();

        System.out.println("Sum: " + (n + m));
        input.close();
    }
}
