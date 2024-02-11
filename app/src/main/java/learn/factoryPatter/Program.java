package learn.factoryPatter;

public class Program {
  public static void main(String[] args) {
    KnifeStore knifeStore = new BudgetKnifStore();
    Knife knife = knifeStore.orderKnife("chef");
    System.out.println(knife.getName());
  }
}
