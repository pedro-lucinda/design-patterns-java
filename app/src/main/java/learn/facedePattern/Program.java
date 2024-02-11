package learn.facedePattern;

public class Program {

  public static void main(String args[]) {
    BankService myBankService = new BankService();
    String mySaving = myBankService.createNewAccount("saving", 100);
    System.out.println("Created savings account with balance " + myBankService.getBalance(mySaving));
    String myInvestment = myBankService.createNewAccount("investment", 0);

    System.out.println("transfer 10 form saving to investment");
    myBankService.transferMoney(myInvestment, mySaving, 10);
    System.out.println("Investment Balance: " + myBankService.getBalance(myInvestment));
    System.out.println("Savings Balance: " + myBankService.getBalance(mySaving));
  }

}
