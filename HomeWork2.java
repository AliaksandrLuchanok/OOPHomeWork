public class HomeWork2 {

  public static final String ANSI_GREEN = "\u001B[32m"; // 100
  public static final String ANSI_PURPLE = "\u001B[35m"; // >= 80 < 100
  public static final String ANSI_BLUE = "\u001B[34m"; // >= 60 < 80
  public static final String ANSI_CYAN = "\u001B[36m"; // >= 40 < 60
  public static final String ANSI_YELLOW = "\u001B[33m"; // >= 20 < 40
  public static final String ANSI_RED = "\u001B[31m";  // > 0 < 20
  public static final String ANSI_WHITE = "\u001B[37m"; // == 0
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";


  public static void main(String[] args) {
      Render render = new Render();

      Building building = new Building(100);
      Hero hero1 = new Hero (100,100);
      Neutral neutral1 = new Neutral(100);

      building.setCurrentHealthPoint(100);
      hero1.setCurrentHealthPoint(100);
      hero1.setCurrentManaPoint(90);
      neutral1.setCurrentHealthPoint(80);

      render.showIndicator(building);
      render.showIndicator(hero1);
      render.showIndicator(neutral1);
      System.out.println();

      building.setCurrentHealthPoint(70);
      hero1.setCurrentHealthPoint(60);
      hero1.setCurrentManaPoint(50);
      neutral1.setCurrentHealthPoint(40);

      render.showIndicator(building);
      render.showIndicator(hero1);
      render.showIndicator(neutral1);
      System.out.println();

      building.setCurrentHealthPoint(30);
      hero1.setCurrentHealthPoint(20);
      hero1.setCurrentManaPoint(10);
      neutral1.setCurrentHealthPoint(0);

      render.showIndicator(building);
      render.showIndicator(hero1);
      render.showIndicator(neutral1);
  }
public static String getStringIndicator(int data) {

      String color;
      if (data == 100) { color = ANSI_GREEN + "[ХХХХХХХХХХ]"; }
      else if (data >= 90 && data < 100)  { color = ANSI_GREEN + "[ХХХХХХХХХ+]"; }
      else if (data >= 80 && data < 90) { color = ANSI_PURPLE + "[ХХХХХХХХ+]"; }
      else if (data >= 70 && data < 80) { color = ANSI_PURPLE + "[ХХХХХХХ+]"; }
      else if (data >= 60 && data < 70) { color = ANSI_BLUE + "[ХХХХХХ+]"; }
      else if (data >= 50 && data < 60) { color = ANSI_BLUE + "[ХХХХХ+]"; }
      else if (data >= 40 && data < 50) { color = ANSI_CYAN + "[ХХХХ+]"; }
      else if (data >= 30 && data < 40) { color = ANSI_CYAN + "[ХХХ+]"; }
      else if (data >= 20 && data < 30) { color = ANSI_YELLOW + "[ХХ+]"; }
      else if (data >= 10 && data < 20) { color = ANSI_YELLOW + "[Х+]"; }
      else if (data > 0 && data < 10) { color = ANSI_RED + "[+]"; }
      else { color = ANSI_WHITE + "[0]" + ANSI_RESET; }
      return color;

}

  static class Render {
      public void showIndicator(Object object) {
          if (object instanceof Healt) {
              System.out.println("Current healt of this " + object.getClass().getSimpleName() + " is--> " + getStringIndicator(((Healt) object).getHealt()) + ANSI_RESET);
          }
          if (object instanceof Energy) {
              System.out.println("Current energy of this " + object.getClass().getSimpleName() + " is--> " + getStringIndicator(((Energy) object).getEnergy()) + ANSI_RESET);
          }
      }
  }


  static class Building implements Healt{ //************************************************************************************

      private int maxHealthPoint; // максимальное количество здоровья
      private int currentHealthPoint; // текущее количество здоровья

      public Building(int maxHealthPoint) {
          this.maxHealthPoint = maxHealthPoint;
          this.currentHealthPoint = maxHealthPoint;
      }

      public void setCurrentHealthPoint(int currentHealthPoint) {
          this.currentHealthPoint = currentHealthPoint;
      }

      @Override
      public Integer getHealt() {
          return this.currentHealthPoint;
      }
  }
  static class Hero implements Healt, Energy { //************************************************************************************

      private int maxHealthPoint; // максимально количество здоровья
      private int currentHealthPoint; // текущее количество здоровья

      private int maxManaPoint; // максимально количество магический энергии
      private int currentManaPoint; // текущее количество магический энергии

      public Hero(int maxHealthPoint, int maxManaPoint) {
          this.maxHealthPoint = maxHealthPoint;
          this.maxManaPoint = maxManaPoint;

          this.currentHealthPoint = maxHealthPoint;
          this.currentManaPoint = maxManaPoint;
      }

      public void setCurrentHealthPoint(int currentHealthPoint) {
          this.currentHealthPoint = currentHealthPoint;
      }

      public void setCurrentManaPoint(int currentManaPoint) {
          this.currentManaPoint = currentManaPoint;
      }

      @Override
      public Integer getEnergy() {
          return this.currentManaPoint;
      }

      @Override
      public Integer getHealt() {
          return this.currentHealthPoint;
      }
  }

  static class Neutral implements Healt{ //************************************************************************************

      private int maxHealthPoint; // максимально количество здоровья
      private int currentHealthPoint; // текущее количество здоровья

      public Neutral(int maxHealthPoint) {
          this.maxHealthPoint = maxHealthPoint;
          this.currentHealthPoint = maxHealthPoint;
      }

      public void setCurrentHealthPoint(int currentHealthPoint) {
          this.currentHealthPoint = currentHealthPoint;
      }

      @Override
      public Integer getHealt() {
          return this.currentHealthPoint;
      }
  }
public interface Healt {
  Integer getHealt();
}
public interface Energy {
  Integer getEnergy();}

}