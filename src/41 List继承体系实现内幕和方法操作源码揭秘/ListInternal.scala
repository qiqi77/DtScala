package dt.scala

/**
 * Created by lenovo on 2015/10/29.
 */
object List_Internal {
  def main(args: Array[String]): Unit ={
    val list: List[Int] = List(1, 2, 3, 4, 5)
//    val list1 = List(1, 2, 3,4, 5)
    val listAny: List[Any] = list
    println(list.isEmpty)
    println(list.head)
    println(list.tail)
    println(list.length)
    println(list.drop(2))
    println(list.map(_*2))
  }
}
