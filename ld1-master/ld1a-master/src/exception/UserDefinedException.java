package exception;

public class UserDefinedException {

	public static void main(String[] args) {
		// int age = 45;
		int age = 20;
		if (age < 21 || age > 58) {
			InvalidAgeException exception = new InvalidAgeException();
			try {
				System.out.println("Inside Try!");
				// throw exception;
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("You are welcome.");
		}
	}
}

// class InvalidAgeException extends Exception {
	//class InvalidAgeException extends Throwable {
	class InvalidAgeException extends RuntimeException {
	public String getMessage() {
		return "Age should be between 21 and 58";
	}
}
