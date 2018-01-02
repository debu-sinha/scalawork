package org.debu.scalafeatures

class BankAccount(initBal:Double) {
  private var balance = initBal
  def deposit(amount: Double) = {balance += amount;  balance }
  def withdraw(amount: Double) = {  balance -= amount;  balance }

 }

class CheckingAccount(initBal:Double) extends BankAccount(initBal){
  override def deposit(amount: Double)={super.deposit(amount-1)}
  override def withdraw(amount: Double)={super.withdraw(amount+1)}
}

