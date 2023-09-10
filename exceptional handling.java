public class ExceptionHandlingExample {    public static void main(String[] args) {
        try {            // Attempt to divide by zero, which will cause an ArithmeticException
            int result = 10 / 0;            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {            // Catch the exception and handle it
            System.out.println("An ArithmeticException occurred: " + e.getMessage());        }
                System.out.println("Program continues after exception handling.");
    }}