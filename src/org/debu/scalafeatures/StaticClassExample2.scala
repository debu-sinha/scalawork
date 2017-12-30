package org.debu.scalafeatures

object Conversion {
  def inchestoFeet(value: Double):String= if(value<0) "invalid input" else "%.2f".format(value/12)+" ft" 
  
  
  def milestoKms(value: Double):String= if(value<0) "invalid input" else "%.2f".format(value*1.6)+" km" 
  
  
  def poundsToKilos(value: Double):String= if(value<0) "invalid input" else "%.2f".format(value/2.2)+" kgs" 
  
}


object mn extends App{
  println(Conversion.milestoKms(3.2))
  println(Conversion.milestoKms(0))
  
   println(Conversion.poundsToKilos(150))
}