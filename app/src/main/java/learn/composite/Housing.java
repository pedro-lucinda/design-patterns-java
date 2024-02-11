package learn.composite;

import java.util.ArrayList;

public class Housing implements IStructure {
  private ArrayList<IStructure> structures;
  private String address;

  public Housing(String address) {
    this.address = address;
    this.structures = new ArrayList<IStructure>();
  }

  public int addStructure(IStructure component) {
    this.structures.add(component);
    return this.structures.size() - 1;
  }

  public IStructure getStructure(int componentNumber) {
    return this.structures.get(componentNumber);
  }

  public void enter() {
    System.out.println("You entered the " + address);
  }

  public void exit() {
    System.out.println("You exited the " + address);
  }

  public void location() {
    System.out.println("You are currently in the " + this.getName());

    for (IStructure struct : this.structures) {
      System.out.println(struct.getName());
    }
  }

  public String getName() {
    return this.address;
  }

}
