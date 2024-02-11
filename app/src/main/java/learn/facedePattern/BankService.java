package learn.facedePattern;

import java.util.Hashtable;

public class BankService {
  private Hashtable<String, IAccount> bankAccounts;

  public BankService() {
    this.bankAccounts = new Hashtable<String, IAccount>();
  }

  public String createNewAccount(String type, int intAmount) {
    IAccount newAccount = null;

    switch (type) {
      case "chequing":
        newAccount = new Chequing(intAmount);
        break;
      case "saving":
        newAccount = new Saving(intAmount);
        break;

      case "investment":
        newAccount = new Investment(intAmount);
        break;
      default:
        System.out.println("Invalid accocount type");
        break;
    }

    if (newAccount == null) {
      throw new Error("Error creating account");
    }

    String accountId = newAccount.getAccountId();
    this.bankAccounts.put(accountId, newAccount);
    return accountId;
  }

  public void transferMoney(String to, String from, int amount) {
    IAccount toAccount = this.bankAccounts.get(to);
    IAccount fromAccount = this.bankAccounts.get(from);

    fromAccount.transfer(amount);
    toAccount.deposit(amount);
  }

  public int getBalance(String id) {
    IAccount account = this.bankAccounts.get(id);
    return account.getBalance();
  }

}
