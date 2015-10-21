package dt.scala

/**
 * Created by lenovo on 2015/10/21.
 */
object Hello_Pattern_Match {
  def main(args: Array[String]): Unit ={
    val data = 2
    data match{
      case 1 => println("First")
      case 2 => println("Second")
      case _ => println("Not Known Number")
    }

    val result = data match{
      case i if i == 1 => "The First"                                          //i的类型是val，声明时会将其实例化为data的内容
      case number if number == 2 => "The Second" + number                             //number类型也是val。 从而它可以在后面的表达式中被使用
      case _ => "Not Known Number"
    }
    println(result)

    "Spark !" foreach{c => println(
      c match{
        case ' ' => "space"
        case ch => "Char: " + ch
      }
      )}

  }
}
