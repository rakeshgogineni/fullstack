package core;

import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
   public static void main(String[] args) {
      String id = "12345";
      System.out.println(id + id);
      int id1 =  Integer.parseInt(id);
      System.out.println(id1 + id1);
      // primitive type
      int i = 100;
      List numbers = new ArrayList();

      // Wrapper Type
      // Integer integer = new Integer(i);
      Integer integer = Integer.valueOf(i);
   
      
      // upcasting
      Object object = integer;
      numbers.add(object);

      int x = 200;
      // type casting
      numbers.add((Integer) x);

      Object object1 = numbers.get(0);
      // downcasting
      Integer integer1 = (Integer) object1;

      System.out.println(numbers);
   }
}
