package dt.scala

/**
 * Created by lenovo on 2015/10/21.
 */
object Curing {
  def main(args: Array[String]): Unit ={
    def multiple(x: Int, y: Int) = x * y
    def multipleOne(x: Int) = (y: Int) => x * y
    println(multipleOne(6)(7))

    def curing(x: Int)(y: Int) = x * y
    println(curing(10)(10))

    val a = Array("Hello", "Spark")
    val b = Array("hello", "spark")
    println(a.corresponds(b)(_.equalsIgnoreCase(_)))

  }
}
