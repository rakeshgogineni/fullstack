package java8;

public class DefaultDemo {
   public static void main(String[] args) {
      MyClass myClass = new MyClass();
      // invoke the default method using the class
      myClass.defaultMethod();
      myClass.abstractMethod("Life's Good");
      // Cannot make a static reference to the non-static method defaultMethod() from the type 
      // MyInterface.defaultMethod();
   }
}

interface MyInterface {
   /*
    * Already existing public and abstract method We must need to implement this
    * method in implementation classes.
    */
   public void abstractMethod(String string);

   // default methods with body
   public default void defaultMethod() {
      System.out.println("Newly added default method");
   }
}

class MyClass implements MyInterface {

   @Override
   public void abstractMethod(String string) {
      System.out.println("abstractMethod" + string);
   }
   // Default methods are allowed only in interfaces.
   // default void defaultMethod() {
   //    System.out.println("Newly added default method");
   // }

   // Cannot reduce the visibility of the inherited method from MyInterface
   //  void defaultMethod() {
   //    System.out.println("Newly added default method");
   // }

   @Override
   public void defaultMethod() {
      System.out.println("overriding Newly added default method");
   }
}
