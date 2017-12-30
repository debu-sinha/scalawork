package org.debu.scalafeatures

class StaticClassExample {
  TestStaticClass.increment
}

//Static companion class for StaticClassExample. needs to have same name as the class it is companion of
object TestStaticClass{
  var instanceCount=0
  def increment()= instanceCount+=1
}


//object keyword defines singleton 
object TestMyClass{
  def main(args: Array[String]){
    for(i<-1 to 100)
      new StaticClassExample
    println(TestStaticClass.instanceCount)  
  }
}