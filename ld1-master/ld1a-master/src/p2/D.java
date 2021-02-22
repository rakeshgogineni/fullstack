package p2;
import p1.A;
public class D {
   public static void main(String[] args) {
      A obj = new A();
      // The field A.var is not visible
      // System.out.println(obj.var);
      // The method m() from the type A is not visible
      // obj.m();

      // System.out.println(obj.defaultvar);
      // obj.defaultm();

      // System.out.println(obj.protectedvar);
      // obj.protectedm();

      System.out.println(obj.publicvar);
      obj.publicm();
   }
}
