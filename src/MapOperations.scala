package dt.scala

/**
 * Created by lenovo on 2015/10/10.
 */
object MapOperations {
  def main(args: Array[String]): Unit ={
    val ages = Map("Rocky" -> 27, "Spark" -> 5)

    for((k,v) <- ages){
      println("Key is " + k + ", value is " + v)
    }

    for((k, _) <- ages){
      println("Key is " + k)
    }
  }
}
