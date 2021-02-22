// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try ...");
//       } 
//       // System.out.println("Fails");
//       catch(Exception exception){
//          System.out.println("Catch .....");
//       }
//       // System.out.println("Fails");
//       finally {
//          System.out.println("Fially .... clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try Alone Error");
//       } finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//       catch(Exception exception){
//          System.out.println("Catch not here!");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try Alone Error");
//       } 
//       catch(ArithmeticException exception){
//          System.out.println("Catch not here!");
//       }
//       catch(Exception exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try Alone Error");
//       } 
//       catch(Exception exception){
//          System.out.println("Catch not here!");
//       }
//       // Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
//       catch(ArithmeticException exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try Alone Error");
//           throw new FileNotFoundException("FNF");
//       } 
//       catch(IOException exception){
//          System.out.println("Catch not here!");
//       }
//       // Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
//       catch(FileNotFoundException exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try Alone Error");
//           throw 100.10f;
//       } 
//       catch(IOException exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          System.out.println("Try Alone Error");
//          String string = "Mango";
//          throw string;
//       } 
//       catch(IOException exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       try {
//          public int test(){
//             return 5;
//          }
//       } 
//       catch(IOException exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//    }
//    public void method(){
//       // public void method1(){

//       // }
//       class Test{

//       }
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("** **");
//       // try {
//       //    System.out.println("Try Alone Error");
//       //    throw new Exception("Test");
//       // } 
//       catch(Exception exception){
//          System.out.println("Catch not here!");
//       }
//       finally {
//          System.out.println("clean up operations like closing databases and files.");
//       }
//    }
// }

// class Master {
//    //declarations and blocks
//    //cannot have statements
//    // int i = 0;
//    // i = i +10;
//    // instance block
//    static {
//       try {
//          System.out.println("Try Alone Error");
//          throw new Exception("Test");
//       } catch (Exception exception) {
//          System.out.println("Catch not here!");
//       }
//    }

//    public static void main(String[] args) {
//       // new Master();
//       System.out.println("***  ***");
//    }
// }

// class Master {
//    public static void main(String[] args) {
//       System.out.println("***  ***");
//    }
//    public static int test() {
//       System.out.println("***  ***");
//       try {
//          throw new Exception();
//          return 1;
//          // Unreachable code
//       } catch (Exception e) {
//          return 2;
//       } finally {
//          return 3;
//       }
//    }
//    public static int test1() {
//       System.out.println("***  ***");
//       try {
//          boolean test = true;
//          if(test){
//          throw new Exception();
//          }
//          return 1;
//          // Unreachable code
//       } catch (Exception e) {
//          return 2;
//       } finally {
//          return 3;
//       }
//    }
// }
