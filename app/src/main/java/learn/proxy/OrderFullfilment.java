package learn.proxy;

import java.util.ArrayList;
import java.util.List;

public class OrderFullfilment implements OrderInterface {
  private List<Warehouse> warehouses;

  public OrderFullfilment() {
    this.warehouses = new ArrayList<Warehouse>();
  }

  public void fullfillOrder(Order order) {
    List<Item> items = order.getItems();

    for (Item item : items) {
      for (Warehouse warehouse : warehouses) {
        if (warehouse.currentInventory(item) > item.getQuantity()) {
          warehouse.fullfillOrder(order);
          break;
        }
      }

    }
  }

  public void addWarehouse(Warehouse warehouse) {
    warehouses.add(warehouse);
  }

  public List<Warehouse> getWarehouses() {
    return warehouses;
  }

}
