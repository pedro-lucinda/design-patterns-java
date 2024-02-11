package learn.facedePattern;


public class Investment implements IAccount {
  private int balance;
  private String accountId;

  public Investment(int intAmount){
    this.balance = intAmount;
    this.accountId = "Investment";
  }

  public void transfer(int amount) {
    this.withdraw(amount);
  }
  
  public void withdraw(int amount){
    if(amount > this.balance){
      throw new Error("Not enoght funds");
    }

    this.balance -= amount;
  }
  public void deposit(int amount){
    this.balance += amount;
  }

  public String getAccountId(){
    return this.accountId;
  }

  public int getBalance(){
    return this.balance;
  }
}
