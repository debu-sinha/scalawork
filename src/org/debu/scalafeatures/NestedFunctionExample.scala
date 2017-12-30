package org.debu.scalafeatures

//method outer has nested parameter and area methods
class NestedFunctionExample {
  def outer(r: Double):(Double, Double)={
    val PI = 3.14
    val parameter = (r: Double) => {2* PI *r}
    val area = (r: Double) => {PI*r*r}
    (parameter(r), area(r))
  }
}

object test extends App{
  val demoObject = new  NestedFunctionExample
  println(demoObject.outer(10))
}