package core;

public class GetterSetter {
   public static void main(String[] args) {
      Employee1 employee = new Employee1();
      // employee.employeeName = "Rambo";

      // employee age should be in 25-60
      // employee.age = 350;
      // employee name should only be read.
      // employee.employeeName = "Rambo";
      // System.out.println(employee.employeeName);
      // System.out.println(employee.age);

      System.out.println(employee.getEmployeeName());
      employee.setAge(500);
      employee.setAge(35);
      System.out.println(employee.getAge());

   }
}

class Employee1 {
   // property (read-only)
   private String employeeName = "Rambo";
   // property (read and write)
   private int age;

   // Getter property
   public String getEmployeeName() {
      return employeeName;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int pAge) {
      //Logical error
      // if (age > 20 && age < 61) {
      if (pAge > 20 && pAge < 61) {
         age = pAge;
      } else {
         System.out.println("Invalid age.");
      }
   }
}