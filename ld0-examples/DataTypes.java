public class DataTypes {
   public static void main(String[] args) {
   // Data Types
   //    String name = "Rambo";
   //    int age = 30;
   //    boolean isManager = false;
   //    float salary = 50000.50f;

   //    // Printing all the values.
   //    System.out.println("Name : " + name);
   //    System.out.println("Age : " + age);
   //    if (isManager) {
   //       System.out.println("A Manager");
   //    } else {
   //       System.out.println("Not A Manager");
   //    }
   //    System.out.println("Salary : " + salary);

   //Creating an object
   DataTypes object = new DataTypes();
   //Calling the function
   object.displayPerson();
   }
   public void displayPerson(){
          // Data Types
      byte age = 55;
      String name = "Rambo";
      short milesTravelled = 32767;
      int experience = 30;
      boolean isManager = false;
      float salary = 50000.50f;
      char initials = 'J';

      // Printing all the values.
      System.out.println("Name : " + name);
      System.out.println("Age : " + age);
      if (isManager) {
         System.out.println("A Manager");
      } else {
         System.out.println("Not A Manager");
      }
      System.out.println("Salary : " + salary);
      System.out.println("Miles Travelled : " + milesTravelled);
      System.out.println("Experience : " + experience);
      
   }
}
