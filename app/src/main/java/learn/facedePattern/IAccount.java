package learn.facedePattern;


public interface IAccount {
  public void deposit(int amount);
  public void withdraw(int amount);
  public void transfer(int amount);
  public String getAccountId();
  public int getBalance();

}
