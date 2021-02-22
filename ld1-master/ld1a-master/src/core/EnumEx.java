package core;

enum Level {
  LOW(1),   MEDIUM(2),   HIGH(3);
  private final int cooling;
  private Level (int cooling){
    this.cooling = cooling;
  }

  public int getCooling() {
    return cooling;
  }
  
}

public class EnumEx {
  public static void main(String[] args) {
    Level level = Level.MEDIUM;

    switch (level) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }

    System.out.println(level.getCooling());
  }
}
