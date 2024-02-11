package learn.proxy;

import java.util.UUID;

public class Item {
  private String id;
  private String name;
  private int quantity;

  public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
    this.id = UUID.randomUUID().toString();
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }

}
