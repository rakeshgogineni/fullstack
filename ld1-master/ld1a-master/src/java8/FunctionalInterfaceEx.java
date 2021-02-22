package java8;

public class FunctionalInterfaceEx {
   public static void main(String[] args) {
// java 7 way
Greeting greeting = new GreetingImpl();
greeting.greet("This is a functional interface & lambda expression example");

// java 8 way
      // Greeting greeting1 = (message) -> {System.out.println(message);};
      Greeting greeting1 = message -> System.out.println(message);
      greeting1.greet("This is a functional interface & lambda expression example");
      greeting1.greet("Message 2");
   }
}

// Functional interface should have one abstract method.
// @FunctionalInterface
interface Greeting{
public abstract void greet(String message);
}

class GreetingImpl implements Greeting{
   @Override
   public void greet(String message) {
      System.out.println(message);
   } 
}
// Invalid '@FunctionalInterface' annotation; Greeting is not a functional interface
// @FunctionalInterface
// interface Greeting{

// }

// Invalid '@FunctionalInterface' annotation; Greeting is not a functional interface
// @FunctionalInterface
// interface Greeting{
// public abstract void greet(String message);
// public abstract void greet1(String message);
// }


