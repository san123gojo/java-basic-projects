import java.util.Scanner;

// Custom Exception Class
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        // Calls the constructor of the parent Exception class
        super(message);
    }
}

public class DivisionExample {

    // Method using 'throws' to declare it might throw our custom exception
    static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            // Manually triggering an error using 'throw'
            throw new DivisionByZeroException("Division by zero is not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number (a): ");
            int a = sc.nextInt();

            System.out.print("Enter the second number (b): ");
            int b = sc.nextInt();

            int result = divide(a, b);
            System.out.println("Result: " + result);
            
        } catch (DivisionByZeroException e) {
            // Catching and handling the specific custom exception
            System.out.println("Exception caught: " + e.getMessage());
            
        } finally {
            // This block always executes regardless of an exception
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}