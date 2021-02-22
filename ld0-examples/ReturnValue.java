public class ReturnValue {
public static void main(String[] args) {
   Demo1 object = new Demo1();
   object.display();
   String returnedValue =    object.display1();
   System.out.println(returnedValue);
}
   
}

class Demo1{
   //void does not return any value
   public void display(){
      String message = "welcome";
      System.out.println(message);
   }
   // return type is String
   public String display1(){
      String message = "welcome 1";
      return message;
   }
}