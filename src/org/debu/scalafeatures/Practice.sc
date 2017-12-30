package org.debu

object Practice {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	val l= 1 to 10                            //> l  : scala.collection.immutable.Range.Inclusive = Range 1 to 10

	l.map(a=>a*a)                             //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 4, 9, 16, 25, 3
                                                  //| 6, 49, 64, 81, 100)
  
  val multilines= List("Hi this is my world", "Wonderful world", "This is my life")
                                                  //> multilines  : List[String] = List(Hi this is my world, Wonderful world, This
                                                  //|  is my life)
                                                  
  //map method use
  multilines.flatMap(_.split(" ")).map((_,1))     //> res1: List[(String, Int)] = List((Hi,1), (this,1), (is,1), (my,1), (world,1)
                                                  //| , (Wonderful,1), (world,1), (This,1), (is,1), (my,1), (life,1))
 
 
  val x = 1 to 10                                 //> x  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
   
  x.foreach(println)                              //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
 
  for(x<-10 to 1 by -1) println(x)                //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  
 val fname="Debu"                                 //> fname  : String = Debu
 val lname="Sinha"                                //> lname  : String = Sinha
 
 println(s"my name is $fname, $lname")            //> my name is Debu, Sinha
 
 for(i<-1 to 10; j<- 2 to 10 if i==j) println(i,j)//> (2,2)
                                                  //| (3,3)
                                                  //| (4,4)
                                                  //| (5,5)
                                                  //| (6,6)
                                                  //| (7,7)
                                                  //| (8,8)
                                                  //| (9,9)
                                                  //| (10,10)
///nested function example
  
class NestedFunctionExample {
  def outer(r: Double):(Double, Double)={
    val PI = 3.14
    val parameter = (r: Double) => {2* PI *r}: Double
    val area = (r: Double) => {PI*r*r}: Double
    (parameter(r), area(r))
  }
}

  val demoObject = new  NestedFunctionExample     //> demoObject  : org.debu.Practice.NestedFunctionExample = org.debu.Practice$Ne
                                                  //| stedFunctionExample$1@7dc7cbad
  println(demoObject.outer(10))                   //> (62.800000000000004,314.0)


  def add(x: Int): Int => Int = y => x + y        //> add: (x: Int)Int => Int
  val add5 = add(5)                               //> add5  : Int => Int = org.debu.Practice$$$Lambda$26/1734161410@51565ec2
	val add56 =add5(6)                        //> add56  : Int = 11
	
	def addAgain(x:Int)(y:Int)= x+y           //> addAgain: (x: Int)(y: Int)Int
	val add5Again=addAgain(5)_                //> add5Again  : Int => Int = org.debu.Practice$$$Lambda$27/1211076369@1593948d
                                                  //| 
  val addAgain56=add5Again(6)                     //> addAgain56  : Int = 11
                                                  
                                                  
}