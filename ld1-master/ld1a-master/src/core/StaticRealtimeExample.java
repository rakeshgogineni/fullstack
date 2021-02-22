package core;

public class StaticRealtimeExample {
   public static void main(String[] args) {
      Employee employee1 = new Employee("Siva");
      Employee employee2 = new Employee("Katrina");
      System.out.println("EARLIER");
      System.out.println(employee1.companyName);
      System.out.println(employee1.name);
      System.out.println(employee2.companyName);
      System.out.println(employee2.name);
      System.out.println("LATER");
      Employee.companyName = "PEACE VENTURES";
      System.out.println(employee1.companyName);
      System.out.println(employee1.name);
      System.out.println(employee2.companyName);
      System.out.println(employee2.name);
   }
}

class Employee {
   static String companyName;
   static {
      companyName = "Paradise";
   }
   String name;

   // Constructor
   public Employee(String pName) {
      name = pName;
   }
}