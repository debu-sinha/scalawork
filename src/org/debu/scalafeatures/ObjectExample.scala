package org.debu.scalafeatures

//singleton object
object ObjectExample extends App {
  private var _lastResNo=0
  
  def newReservation()={_lastResNo+=1;_lastResNo}
}