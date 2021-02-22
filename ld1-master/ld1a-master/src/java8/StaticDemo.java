package java8;

public class StaticDemo {
   public static void main(String[] args) {
      MyInterface1.staticMethod();
      MyInterface1 myInterface1 = new MyClass1();
      // This static method of interface MyInterface1 can only be accessed as
      // MyInterface1.staticMethod
      // myInterface1.staticMethod();
      // MyClass1 myClass1 = new MyClass1();
      // The method staticMethod() is undefined for the type MyClass1
      // myClass1.staticMethod();
   }
}

interface MyInterface1 {
   // static methods with body
   public static void staticMethod() {
      System.out.println("Newly added static method");
   }

   void abstractMethod(String str);
}

class MyClass1 implements MyInterface1 {
   @Override
   public void abstractMethod(String string) {
      System.out.println("abstractMethod" + string);
   }
}
