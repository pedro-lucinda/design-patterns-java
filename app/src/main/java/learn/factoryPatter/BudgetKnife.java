package learn.factoryPatter;

public class BudgetKnife extends Knife{
  private String name;
  private int price;

  public BudgetKnife() {
    name = "Budget Knife";
    price = 10;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}