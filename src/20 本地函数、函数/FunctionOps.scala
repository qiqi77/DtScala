package dt.scala

import scala.io.Source

/**
 * Created by lenovo on 2015/10/19.
 */
object FunctionOps {
  def main(args: Array[String]): Unit ={
    val width = args(0).toInt
    for(arg <- args.drop(1))
      processData(arg, width)

   def processData(filename: String, width: Int): Unit ={
     def processLine(line: String): Unit ={
       if(line.length > width)
         println(filename + ": " + line)
     }

     val source = Source.fromFile(filename)
     for(line <- source.getLines)
       processLine(line)
   }

    var increase = (x: Int) => x + 1
    println(increase(10))
    increase = (x: Int) => x + 9999

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => print(x))
    println
    someNumbers.filter((x: Int) => x > 0).foreach((x: Int) => print(x))
    println
    someNumbers.filter((x) => x > 0).foreach((x: Int) => print(x))
    println
    someNumbers.filter(x => x > 0).foreach((x: Int) => print(x))
    println
    someNumbers.filter(_ > 0).foreach((x: Int) => print(x))
    println
    val f = (_: Int) + (_: Int)
    println(f(5, 10))






  }
}
