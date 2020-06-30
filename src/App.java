
// import java.util.Calendar;
import java.util.Scanner;

public class App {
    // Implemented in a separate file. WilfredCalculator.java
    // public static int getCurrentAge(int yob) {
    // Calendar calendar = Calendar.getInstance();
    // int currentYear = calendar.get(Calendar.YEAR);
    // return currentYear - yob;
    // }

    public static void main(String[] args) throws Exception {
        // variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your name? ");
        String name = scanner.nextLine().trim();
        System.out.print("Whats your year of birth? ");
        int yob = Integer.parseInt(scanner.nextLine().trim());
        scanner.close();
        // int age = App.getCurrentAge(yob);
        int age = new WilfredCalculator().getCurrentAge(yob);
        System.out.println("Hello, " + name + "!\n" + "You are " + age + " years old.");
    }
}
