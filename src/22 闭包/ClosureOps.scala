package dt.scala

/**
 * Created by lenovo on 2015/10/19.
 */
object ClosureOps {
  def main(args: Array[String]): Unit ={
    val data = List(1, 2, 3, 4, 5, 6)
    var sum = 0
    data.foreach(sum += _)                                          //必须先声明sum，然后才能使用

    def add(more: Int) = (x: Int) => x + more
    val a = add(1)
    val b = add(9999)                                                        //9999传给more
    println(a(10))                                                           //10是传递给x的，
    println(b(10))                                                           //10传递给x



  }
}
