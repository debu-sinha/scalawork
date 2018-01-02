package org.debu.scalafeatures

object Practicesheet2 {
    //reading workds from a file and printing the words greater than 10 characters
    import scala.io.Source
		
	   val filename = "/Users/sinhad2/Desktop/test.doc"
                                                  //> filename  : String = /Users/sinhad2/Desktop/test.doc
                         
	   Source
	  .fromFile(filename)
	  .getLines
	  .flatMap(line => line.split("\\s+"))
	  .filter(_.length()>10)
	  .foreach(println)                       //> alshdlakjhsd
                                                  //| ;aklhsd;kahsdahsd
                                                  //| h;lkshd;ahsd
                                                  //| ah;ohddwo;iehf
                                                  //| c;sdf;sioefseihf.sknd
                                                  //| bouehrfh;ds;sfoiwhe
	  
	  //read all lines in a file and reverse the order
	    Source
	  .fromFile(filename)
	  .getLines
	  .toList
	  .reverse
	  .foreach(println)                       //> fsduf osduh sdhf ;ohos;ih jsndkj bouehrfh;ds;sfoiwhe  sk;ofihs ;oefwe
                                                  //| c;sdf;sioefseihf.sknd ;owei;f s'jS
                                                  //| askjdbasd alshdlakjhsd  lakhsdkah l khsdlkja lkh;h ;aklhsd;kahsdahsd hasda h
                                                  //| ;lkshd;ahsd akhsd;l ah;ohddwo;iehf clskhd ;wh;eof 
 }