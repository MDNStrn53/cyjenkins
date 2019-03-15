package ca.uwo.csd.cs2212.USERNAME;
public class BankAccount {  #bank account class that maintained it balance
  private double balance;   #The class maintained it balance
  public BankAccount(double balance) { #Constructor that initialize balance
    this.balance = balance;
  }
  public double debit(double amount) { #Debit method that allow us to withdraw
    if (balance < amount) {
      amount = balance;
    }
    balance -= amount; # Return amount that was actually debited from the acct
    return amount;
  }
}
