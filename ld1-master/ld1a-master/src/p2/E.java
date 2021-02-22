package p2;

import p1.A;
public class E extends A{
   public static void main(String[] args) {
      A obj = new A();
      E obj1 = new E();
      // The field A.var is not visible
      // System.out.println(obj.var);
      // The method m() from the type A is not visible
      // obj.m();

      // System.out.println(obj.defaultvar);
      // obj.defaultm();

      // //instance of object cannot access.
      // System.out.println(obj.protectedvar);
      // obj.protectedm();
      System.out.println(obj1.protectedvar);
      obj1.protectedm();

      System.out.println(obj.publicvar);
      obj.publicm();
      System.out.println(obj1.publicvar);
      obj1.publicm();
   }
}
