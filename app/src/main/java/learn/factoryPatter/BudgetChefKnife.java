package learn.factoryPatter;

public class BudgetChefKnife extends Knife {
  private String name;
  private int price;

  public BudgetChefKnife() {
    name = "Budget Chef Knife";
    price = 20;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}
