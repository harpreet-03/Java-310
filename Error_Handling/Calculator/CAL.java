// Custom exceptions
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

class CustomCalculator {
    // Method to perform addition
    public double add(double a, double b) throws MaxInputException, InvalidInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds the maximum limit of 100000.");
        }
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Invalid input: Negative numbers are not allowed.");
        }
        return a + b;
    }

    // Method to perform subtraction
    public double subtract(double a, double b) throws MaxInputException, InvalidInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds the maximum limit of 100000.");
        }
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Invalid input: Negative numbers are not allowed.");
        }
        return a - b;
    }

    // Method to perform multiplication
    public double multiply(double a, double b) throws MaxInputException, MaxMultiplierReachedException, InvalidInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds the maximum limit of 100000.");
        }
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplier exceeds the maximum limit of 7000.");
        }
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Invalid input: Negative numbers are not allowed.");
        }
        return a * b;
    }

    // Method to perform division
    public double divide(double a, double b) throws MaxInputException, CannotDivideByZeroException, InvalidInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input exceeds the maximum limit of 100000.");
        }
        if (b == 0) {
            throw new CannotDivideByZeroException("Cannot divide by zero.");
        }
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Invalid input: Negative numbers are not allowed.");
        }
        return a / b;
    }
}

public class CAL {
    public static void main(String[] args) {
        CustomCalculator calculator = new CustomCalculator();

        try {
            System.out.println("Addition: " + calculator.add(50000, 50000));
            System.out.println("Subtraction: " + calculator.subtract(50000, 10000));
            System.out.println("Multiplication: " + calculator.multiply(7000, 5000));
            System.out.println("Division: " + calculator.divide(100000, 10));
        } catch (InvalidInputException | CannotDivideByZeroException | MaxInputException | MaxMultiplierReachedException e) {
            System.out.println(e.getMessage());
        }
    }
}
