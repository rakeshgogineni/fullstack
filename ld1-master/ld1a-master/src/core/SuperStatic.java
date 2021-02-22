package core;
public class SuperStatic{
   
   public static void main(String args[]) {
      new SubClass().display();
   }
}
class SuperClass{
   protected String name;
}
 class SubClass extends SuperClass {
   private String name;
   public static void setName(String name) {
      //super and this belong to instances
      // super.name = name;
   }
   public void display() {
      System.out.println("name: "+super.name);
   }
}