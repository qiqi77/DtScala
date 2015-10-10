package dt.scala

/**
 * Created by lenovo on 2015/10/10.
 */
object For_Function_Advanced {
  def main(args: Array[String]): Unit ={
    for(i <- 1 to 2; j <- 1 to 2) print((100 * i + j) + " ")  //i,j不用声明类型，会根据右边推断
    println

    for(i <- 1 to 2; j <- 1 to 2 if i != j) print((100*i + j) + " ")  //for循环中加入了 条件判断。较常用
    println

    //函数定义
    def addA(x: Int) = x + 100    //函数有值，所以函数可以作为另一个函数的参数
    val add = (x: Int) => x +200  //右侧是个匿名函数  (因为函数有值，所以可以把函数赋值给常量）函数是有值的(*)
    println("The result from a function is: " + addA(2))
    println("The result from a val is : " + add(2))

    def fac(n: Int): Int = if(n <= 0) 1 else n * fac(n - 1)  //Scala中递归调用函数 要指明返回值类型
    println("The result from a fac is : " + fac(10))

    def combine(context: String, left: String = "[", right: String="]") = left + context + right  //为参数指定了值
    println("The result from a combine is : " + combine("I love Spark"))
    println("The result from a combine is : " + combine("I love Spark", "<<")) //传入的新参数只 会覆盖掉 默认值

    def connected(args: Int*) = {   //可变参数：参数可以有很多个
      var result = 0
      for(arg <- args) result += arg
      result
    }
    println("The result from a connected is : " + connected(1,2,3,4,5))
  }
}
