package dt.scala

/**
 * Created by lenovo on 2015/10/26.
 */
object Option_Internal {
  def main(args: Array[String]) {
    val scores = Map("Alice" -> 99, "Spark" -> 100)

    scores.get("Spark") match{
      case Some(score) => println(score)
      case None => println("No score")                                          //Some None都是Option的子类
    }
  }
}
