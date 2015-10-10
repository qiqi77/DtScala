package dt.scala

import scala.io.Source

/**
 * Created by lenovo on 2015/10/10.
 */
object FileOps {
  def main(args: Array[String]): Unit ={
//    val file = Source.fromFile("E:\\aa.txt")
    val file1 = Source.fromURL("http://spark.apache.org/")
    for(line <- file1.getLines){   //getLine()得到的是迭代器：Iterator[String]
      println(line)
    }
  }
}
