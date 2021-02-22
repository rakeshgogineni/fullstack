package p1;

public class C {
   public static void main(String[] args) {
      A obj = new A();
      C obj1 = new C();
      // The field A.var is not visible
      // System.out.println(obj.var);
      // The method m() from the type A is not visible
      // obj.m();

      System.out.println(obj.defaultvar);
      obj.defaultm();

      // accessible by other classes in the same package, even if not inheriting
      System.out.println(obj.protectedvar);
      obj.protectedm();
      // System.out.println(obj1.protectedvar);
      // obj1.protectedm();

      System.out.println(obj.publicvar);
      obj.publicm();
   }
}
