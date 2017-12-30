package org.debu.scalafeatures

class CompanionClassExample {
  CompanionClassExample.incrementInstanceCnt
}

//companion objects. The companion class should be in same class file as the original class. they can be used to define static methods
object CompanionClassExample{
  var instanceCnt=0
  def printInstanceCnt= println(s"$instanceCnt")
  def incrementInstanceCnt= instanceCnt+=1
}

object Main{
  def main(args: Array[String]): Unit={
    for(i<-1 to 10)
      new CompanionClassExample
    CompanionClassExample.printInstanceCnt
  }
}