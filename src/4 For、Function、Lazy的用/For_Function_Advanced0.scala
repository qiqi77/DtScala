package dt.scala

/**
 * Created by lenovo on 2015/10/12.
 */
object For_Function_Advanced0 {
  def main(args: Array[String]): Unit ={
    for(i <- 1 to 2; j <- 1 to 2) println((100 * i + j) + " ")
    println

    for(i <- 1 to 2; j <- 1 to 2 if i != j) print((100*i + j) + " ")
    println

    val addA(x: Int) = x + 100
    val add = (x: Int) => x + 200
    println("The result from a function is: " + addA(2))
    println("The result from a val is: " + add(2))

    def fac(n: Int): Int = if(n <= 0) 1 else n * fac(n - 1)
    println("The result from a fzc is: " + fac(10))

    def combine(context:String, left: String = "[", right: String = "]") = left + context + right
    println("The result from a conbine is : " + combine("I love Spark"))
    println("The result from a combine is : " + combine("I love Spark", "<<"))

    def connected(args: Int*): Unit ={
      var result = 0
      for(arg <- args) result += arg
      result
    }
    println("The result from a connected to : " +connected(1,2,3,4,5))

  }
}
