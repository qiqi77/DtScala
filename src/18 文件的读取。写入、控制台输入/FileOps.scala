package dt.scala

import java.io.{File, PrintWriter}

import scala.io.Source

/**
 * Created by lenovo on 2015/10/18.
 */
object FileOps {
  def main(args: Array[String]): Unit ={
    val file = Source.fromFile("E:\\a.txt")
    for(line <- file.getLines){ println(line) }
    file.close()

    val webFile = Source.fromURL("http://spark.apache.org/")
    webFile.foreach(print)
    webFile.close()

    val writer = new PrintWriter(new File("scalaFile.txt"))
    for(i <- 1 to 100) writer.println(i)
    writer.close()

    println("Please enter your input: ")
    val line = Console.readLine
    println("Thanks, you just typed: " + line)

  }
}
