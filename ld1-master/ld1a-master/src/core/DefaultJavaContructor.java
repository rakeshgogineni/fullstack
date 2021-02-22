package core;

public class DefaultJavaContructor {
   public static void main(String[] args) {
      Test1 test = new Test1();
      System.out.println(test.i);
   }
}

class Test1 {
   // initialized to 0 by default constructor
   int i;
}