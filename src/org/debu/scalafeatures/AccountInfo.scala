package org.debu.scalafeatures

class AccountInfo {
  private var _balance = 0.0

  def withdraw(amount: Double) {
    if (_balance >= amount) { _balance -= amount } else println("insufficient funds")
  }

  def deposit(amount: Double) { _balance += amount }
  
  //getter
  def balance() = _balance

  
  //setter
  //def balance_(value: Double){_balance=value}
}

object m extends App{
  val k = new AccountInfo
  k.deposit(1000)
  println(k.balance) 
  k.withdraw(80)
  println(k.balance) 
}