package org.debu.scalafeatures
//for pattern matching. dont need a constructor. Are for immutable data
//makes all parameters as val by default
case class CaseClassExample(a: Int, b: Int) {
}

object ma extends App{
  //no need for the new
  val x= CaseClassExample(10, 20)
  val y= CaseClassExample(10, 20)
  println(x==y)

}