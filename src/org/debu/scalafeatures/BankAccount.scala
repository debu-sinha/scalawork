package org.debu.scalafeatures

class BankAccount(initBal:Double) {
  private var balance = initBal
  def deposit(amount: Double)={if(balance>0) {balance+=(amount+1)}; balance}
  def withdraw(amount: Double)={if(balance>(amount+1)){balance-=(amount+1)}; balance}
}