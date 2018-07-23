package ca.uwo.csd.cs2212.USERNAME_you_created;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount { #used to test code for error

@test
public void testDebitWithSufficientFunds() {
  BankAccount = new BankAccount(10);          #We enstainiate a new bank object 
  double amount = account.debit(5);
  Assert.assertEquals(5.0);
 }

@test
public void testDebitWithInsufficientFunds() {
  BankAccount = new BankAccount(10);          #We enstainiate a new bank object 
  double amount = account.debit(11);
  Assert.assertEquals(10);
 }
}
