package core.explore;

public class AbstractClassVsInterfaces {

}

interface I1{  
   String youngLeader1 = "Siva";
   final String youngLeader2 = "Siva";
   public final String youngLeader3 = "Siva";
   //no concrete method or method with body
   // public void test(){
   // }
   // all the below are public and abstract
   void m1();
   abstract void m2();
   public abstract void m3();

   public static void m4(){
      System.out.println("Method with body from java 8");
   }
   public default void m5(){
      System.out.println("Method with body from java 8");
   }
}

abstract class A1{
   // final and non final variables
   public final String youngLeader3 = "Siva";
   public  String youngLeader4 = "Siva";
      //abstract method
      public abstract void test1();
   // non -abstract method
   public void test(){
      System.out.println("No abstract methods in this class!");
   }
   // public abstract void test1(){
   // }

   public static void m4(){
      System.out.println("Method with body from java 8");
   }

   // Default methods are allowed only in interfaces.
   // public default void m5(){
   //    System.out.println("Method with body from java 8");
   // }
}