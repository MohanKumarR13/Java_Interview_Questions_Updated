package epam;

//Custom exception class
class InvalidAgeException extends Exception {
 // Constructor that accepts a message
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class CustomExceptionExample {
 // Method to check age
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18 || age > 100) {
         throw new InvalidAgeException("Age must be between 18 and 100.");
     }
     System.out.println("Valid age: " + age);
 }

 public static void main(String[] args) {
     try {
         // Test with invalid age
         checkAge(150);  // This will throw an exception
     } catch (InvalidAgeException e) {
         // Catch the custom exception and display the error message
         System.out.println("Error: " + e.getMessage());
     }

     try {
         // Test with valid age
         checkAge(25);  // This will not throw an exception
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

