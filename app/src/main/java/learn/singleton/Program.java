package learn.singleton;

public class Program {

  public static void main(String[] args) {
    SingletonClass singleton = SingletonClass.getSingleInstance();
    SingletonClass anotherSingleton = SingletonClass.getSingleInstance();
    System.out.println(singleton == anotherSingleton);
  }
}
