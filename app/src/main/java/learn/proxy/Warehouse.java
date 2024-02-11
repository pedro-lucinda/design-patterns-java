package learn.proxy;

import java.util.Hashtable;
import java.util.UUID;

public class Warehouse implements OrderInterface {
  private String id;
  private Hashtable<String, Integer> stock;

  public Warehouse() {
    this.id = UUID.randomUUID().toString();
    this.stock = new Hashtable<String, Integer>();
  }

  public void addStock(Item item, int quantity) {
    stock.put(item.getName(), quantity);
  }

  public void fullfillOrder(Order order) {
    for (Item item : order.getItems()) {
      int itemQuantity = item.getQuantity();
      int stockQuantity = stock.get(item.getName()).intValue();
      int remainingQuantity = stockQuantity - itemQuantity;
      stock.put(item.getName(), remainingQuantity);
    }
  }

  public int currentInventory(Item item) {
    if (stock.containsKey(item.getName())) {
      return stock.get(item.getName()).intValue();
    }
    return 0;
  }

  public String getId() {
    return id;
  }

  public Hashtable<String, Integer> getStock() {

    return stock;
  }

}
