package learn.factoryPatter;

public abstract class Knife {
   private String name;
   private int price;

   public void sharpen() {
      System.out.println("sharpen");
   }

   public String getName() {
      return this.name;
   }

   public int getPrice() {
      return this.price;
   }
}
