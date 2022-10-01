import java.util.Scanner;

public class Q24 {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int number = scan.nextInt();
    int log = (int) Math.log10(number)+1;

    System.out.print("That number has " + log + " digits.");
  }

}
