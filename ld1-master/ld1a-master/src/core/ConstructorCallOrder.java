package core;

public class ConstructorCallOrder {
   public static void main(String[] args) {
      // D1 d1 = new D1();
      T t = new T("Tea is good for everyone!");
   }
}

class B {
   B() {
      System.out.println("B cons");
   }
}

class D extends B {
   D() {
      super();
      System.out.println("D");
   }

   D(String message) {
      super();
      System.out.println("D " + message);
   }
}

class D1 extends D {
   D1() {
      // super();
      super("life is great!");
      System.out.println("D1");
   }
}

class T {
   T() {
      System.out.println("Tea is made of tea leaves and not coffee beans!");
   }

   T(String message) {
      this();
      System.out.println(message);
   }
}