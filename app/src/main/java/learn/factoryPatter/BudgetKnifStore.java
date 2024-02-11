package learn.factoryPatter;

public class BudgetKnifStore extends KnifeStore {
  Knife createKnife(String type) {
      if(type.equals("chef")){
        return new BudgetChefKnife();
      }
      return new BudgetKnife();
  }
}
