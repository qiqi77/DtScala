package dt.scala

import scala.io.Source

/**
 * Created by lenovo on 2015/10/10.
 */
object LazyOps {
  def main(args: Array[String]): Unit ={
    lazy val file = Source.fromFile("E:\\a.txt")  //该路径下不存在。lazy：只在第一次被使用时，才会实例化。对数据迭代处理，看到更多的处理步骤

    println("Scala")
//    for(line <- file.getLines) println(line)
  }
}
