package dt.scala

/**
 * Created by lenovo on 2015/10/12.
 */
object Map_Tuple {
  def main(args: Array[String]): Unit ={
    val map = Map("book" -> 10, "gun" -> 18, "ipad" -> 1000)        //默认是immutable的map。不可变 [String，Int]
    for((k, v) <- map) yield (k, v * 0.9)                           //通过模式匹配。乘以0.9后，类型变成了[String, Double]。  结果仍是immutable的

    val scores = scala.collection.mutable.Map("Scala"->7, "Hadoop" -> 8, "Spark" -> 10)
    val hadoopScore = scores.getOrElse("Hadoop", 0)          //如何key中欧Hadoop，则返回对应的值。如果没有，则返回设置的0.
    scores += ("R" -> 9)
    scores -= "Hadoop"

    val sortedScore = scala.collection.immutable.SortedMap("Scala" -> 7, "Hadoop" -> 8, "Spark" -> 10)   //按照key排序。String可排序，按字典序

    val tuple = (1, 2, 3.14, "Rocky", "Spark")                                                //（*）Spark中重要。 不同类型 元素集合。  索引从1开始。接受函数返回值。（可能返回若干值，参数传递时也可能传递了若干值）
    val third = tuple._3                                                                      //第三个元素。点可以用空格代替，但空格不明显。
    val (first, second, thirds, fourth, fifth) = tuple                                        //函数返回多个值。所以就接收多个值
    val (f, s, _, _, _) = tuple                                                               //占位符

    "Rocky Spark".partition(_.isUpper)                                                        //参数：布尔表达式   结果：（RS, acky park)    （真的一组，假的一组）

    val symbols = Array("[", "-", "]")                                //合并两个集合，相同索引处的元素合并
    val counts = Array(2, 5, 2)
    val pairs = symbols.zip(counts)                                  //结果:Array( ([,2), (-, 5), (], 2) )
    for((x, y) <- pairs) Console.print(x * y)                        // [[-----]]

  }
}
