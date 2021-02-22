package core;

public class AbstractClassDemo {
   // existing in thought or as an idea but not having a physical or concrete
   // existence.
   // Bus : concrete class
   // Education : abstract class
   // Internet : abstract class
   // Abstract Classes : Sound, Transportation
   public static void main(String[] args) {
      Education education = null;
      // cannot create an instance
      // education = new Education();
      education = new ITCompany();
      education.teaching();
   }
}

// abstract class has zero or more abstract methods
abstract class Education {
   // abstract methods do not have a body
   abstract void teaching();
}

class ITCompany extends Education{
   @Override
   void teaching() {
      System.out.println("Development Training");
   }
   
}