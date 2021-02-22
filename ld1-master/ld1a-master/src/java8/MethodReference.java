package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
   public static void main(String[] args) {

      // This list takes a collection of objects
      // List fruitsList = new ArrayList();
      // Test test = new Test();
      // fruitsList.add(test);
      // fruitsList.add("orange");
      // fruitsList.add("apple");

      // This list takes a collection of strings using Generics
      List<String> fruitsList = new ArrayList<String>();
      Test test = new Test();
      // fruitsList.add(test);
      fruitsList.add("orange");
      fruitsList.add("apple");

      // fruitsList.forEach(fruit -> System.out.print(fruit));
      // The method reference ::
      fruitsList.forEach(System.out::print);
   }
}

class Test {

}