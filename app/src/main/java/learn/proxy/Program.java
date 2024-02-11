package learn.proxy;

import java.util.List;

public class Program {
  public static void main(String[] args) {
    Warehouse warehouse = new Warehouse();
    Item item1 = new Item("item1", 10);
    Item item2 = new Item("item2", 20);
    Item item3 = new Item("item3", 30);
    warehouse.addStock(item1, 10);
    warehouse.addStock(item2, 20);
    warehouse.addStock(item3, 30);

    System.out.println("Warehouse stock: " + warehouse.getStock());

    OrderFullfilment orderFullfilment = new OrderFullfilment();
    orderFullfilment.addWarehouse(warehouse);

    List<Item> items = List.of(new Item("item1", 10), new Item("item2", 8));
    System.out
        .println("Order items quantity: " + "item1-" + items.get(0).getQuantity() + "  item2-" + items.get(1).getQuantity());

    Order order = new Order(items);
    System.out.println("Order number: " + order.getOrderNumber());

    orderFullfilment.fullfillOrder(order);
    System.out.printf("Warehouse stock: " + warehouse.getStock());
  }
}
