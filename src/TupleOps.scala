package dt.scala

/**
 * Created by lenovo on 2015/10/10.
 */
object TupleOps {
  def main(args: Array[String]): Unit ={
    val triple = (100, "Scala", "Spark")
    println(triple._1)  //Scala中triple的下标从1开始
    println(triple._2)
  }
}
