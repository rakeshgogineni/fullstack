package core;

public class FinalDemo {
final String choice = "good";
private void m() {
   // The final field FinalDemo.choice cannot be assigned
   // choice = "bad";
}
}

final class Base {
   public final void m() {

   }
   public  void m1() {

   }
}

// class Derived extends Base {
//    // Cannot override the final method from Base
   // // @Override
   // public void m() {

   // }
//    @Override
//    public  void m1() {

//    }
// }

// //The type Derived cannot subclass the final class Base
// class Derived extends Base{

// }
