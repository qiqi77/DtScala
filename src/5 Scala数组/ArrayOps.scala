package dt.scala

import scala.collection.mutable.ArrayBuffer

/**
 * Created by lenovo on 2015/10/10.
 */
object ArrayOps {
  def main(args: Array[String]): Unit ={
    val nums = new Array[Int](10)
    val a = new Array[String](10)
    val s = Array("Hello", "World")        //类型推断
    s(0) = "GoodBye"

    val b = ArrayBuffer[Int]()
    b += 1
    b += (1, 2, 3, 5)
    b ++= Array(8, 13, 21)
    b.trimEnd(5)
    b.insert(2, 6)
    b.insert(2, 7, 8, 9)
    b.remove(2)
    b.remove(2, 3)
    b.toArray               //它不可修改。b本身没变


    for(i <- 0 until a.length)
      println(i + ": " + a(i))

    val c = Array(2, 3, 5, 7, 11)
    val result = for(elem <- c) yield 2 * elem                              //用yield，不写：elem * 2
    for(elem <- c if elem % 2 == 0) yield 2 * elem                          //偶数 * 2
    c.filter(_ % 2 == 0).map(2 * _)                                         //更常见。_是占位符。每个元素都要和2取模。（每次只循环一个时，可以用占位符，不用取名字）

    Array(1, 7, 2, 9).sum
    ArrayBuffer("Mary", "had", "a", "little", "lamb").max                  //因为是字符串，所以是判断 哪个长度最长.【问题】：测试有问题

    val d = ArrayBuffer(1, 7, 2, 9)
    val bSorted = d.sorted

    val e = Array(1, 7, 2, 9)                              //不可变数组
    scala.util.Sorting.quickSort(e)

    e.mkString(" and ")
    e.mkString(",", ",", ">")                             //* 多个

    //矩阵
    val matrix = Array.ofDim[Double](3, 4)                //Int也可，3行4列
    matrix(2)(1) = 42
    val triangle = new Array[Array[Int]](10)
      for(i <- 0 until triangle.length)                  //until不包含 最后一个
        triangle(i) = new Array[Int](i + 1)              //第一行1个元素。  第二行2个数组，第三行3和Array[Int]



  }
}
