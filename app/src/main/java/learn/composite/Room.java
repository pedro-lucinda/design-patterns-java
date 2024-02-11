package learn.composite;

public class Room implements IStructure {
  public String name;

  public Room(String name) {
    this.name = name;
  }

  public void enter() {
    System.out.println("You entered the " + this.name);
  }

  public void exit() {
    System.out.println("You exited the " + this.name);
  }

  public void location() {
    System.out.println("You are currently in the " + this.getName());

  }

  public String getName() {
    return this.name;
  }

}
