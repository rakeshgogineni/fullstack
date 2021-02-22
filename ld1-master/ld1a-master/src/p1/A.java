package p1;

public class A {
   // private members
   private String var = "private var";

   private void m() {
      System.out.println("private m()");
   }

   // default members
   String defaultvar = "default var";

   void defaultm() {
      System.out.println("default m()");
   }
   // protected members
   protected String protectedvar = "default var";
   protected void protectedm() {
      System.out.println("protected m()");
   }

   //public members (global access)
   public String publicvar = "default var";
   public void publicm() {
      System.out.println("public m()");
   }
   // protected void m1() {
   // System.out.println(var);
   // m();
   // System.out.println("private m()");
   // }

   public static void main(String[] args) {
      A obj = new A();
      System.out.println(obj.var);
      obj.m();
      System.out.println(obj.defaultvar);
      obj.defaultm();
      System.out.println(obj.protectedvar);
      obj.protectedm();
      System.out.println(obj.publicvar);
      obj.publicm();
   }
}
