package learn.singleton;

public class SingletonClass {
  private static SingletonClass uniqueInstance = null;

  private SingletonClass() {
  }

  public static SingletonClass getSingleInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new SingletonClass();
    }
    return uniqueInstance;
  }
}