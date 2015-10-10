package dt.scala

/**
 * Created by lenovo on 2015/10/10.
 */
object ArrayOperations {

    def main(args: Array[String]): Unit ={
      val array = Array(1,2,3,4,5)
      for(i <- 0 until array.length){
        println(array(i))
      }

      for(elem <- array){
        println(elem)
      }

      for(elem <- array) println(elem)
    }


}
