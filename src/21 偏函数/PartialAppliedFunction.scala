package dt.scala

/**
 * Created by lenovo on 2015/10/19.
 */
object PartialAppliedFunction {
  def main(args: Array[String]): Unit ={
    val data = List(1, 2, 3, 4, 5, 6)
    data.foreach(println _)
    data.foreach(x => println(x))

    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(1, 2, 3))

    val fp_a = sum _                               //fp_a是个指针，指向sum函数
    println(fp_a(1, 2, 3))
    println(fp_a.apply(1, 2, 3))
    val fp_b = sum(1, _: Int, 3)                          //偏函数，可以只传递其中部分值。必须指明参数
    println(fp_b(2))
    println(fp_b(10))

//    data.foreach(println(_))
    data.foreach(println _)
    data.foreach(println)
  }
}
