
import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        // variables
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your name? ");
        final String name = scanner.nextLine().trim();
        System.out.print("Whats your year of birth? ");
        final int yob = Integer.parseInt(scanner.nextLine().trim());
        scanner.close();
        final int age = new WilfredCalculator().getCurrentAge(yob);
        System.out.println("Hello, " + name + "!\n" + "You are " + age + " years old.");
    }
}
