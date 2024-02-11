package learn.proxy;

import java.util.UUID;

import java.util.List;

public class Order {
  private List<Item> items;
  private String orderNumber;

  public Order(List<Item> items) {
    this.items = items;
    this.orderNumber = UUID.randomUUID().toString();
  }

  public List<Item> getItems() {
    return items;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

}
