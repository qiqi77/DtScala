package dt.scala

import scala.collection.immutable.Queue
import scala.reflect.ClassTag

/**
 * Created by lenovo on 2015/11/5.
 */
class Triple[F: ClassTag, S, T](val first: F, val second: S, val third: T)

object Hello_Type_Parameterization {
  def main(args: Array[String]): Unit ={
    val triple = new Triple("Spark", 3, 3.1415)
    val bigData = new Triple[String, String, Char]("Spark", "Hadoop", 'R')

    def getData[T](list: List[T]) = list(list.length / 2)
    println(getData(List("Spark", "Hadoop", 'R')))
    val f = getData[Int] _                               //val f: List[Int] => Int
    println(f(List(1, 2, 3, 4, 5, 6)))


    def foo[A, B](f: A=> List[A], b: A) = f(b)                 //因为f，所以f(b)中b必须是A类型       （上下文）
  }
}














