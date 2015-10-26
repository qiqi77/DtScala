package dt.scala

/**
 * Created by lenovo on 2015/10/26.
 */
object HelloList {
  def main(args: Array[String]) {
    val bigData = List("Hadoop", "Spark")
    val data = List(1, 2, 3)

    val bigData_Core = "Hadoop" :: ("Spark" :: Nil)
    val data_Int = 1 :: 2 :: 3 :: Nil

    println(data.isEmpty)
    println(data.head)                                  //head是List中第一个，tail是剩下的全部
    println(data.tail.head)

    val List(a, b) = bigData
    println("a: " + a + " === " + "b: " + b)
    val x :: y :: rest = data                                  //右结合
    println("x : " + x + " === " + " y: " + y + " === " + rest)

    val shuffledData = List(6, 3, 5, 6, 2, 9, 1)
    println(sortList(shuffledData))

    def sortList(list: List[Int]): List[Int] = list match{
      case List() => List()
      case head :: tail => compute(head, sortList(tail))
    }

    def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match{
      case List() => List(data)
      case head :: tail => if(data <= head) data :: dataSet
        else head :: compute(data, tail)
    }

  }
}
