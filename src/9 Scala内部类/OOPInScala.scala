package dt.scala

/**
 * Created by lenovo on 2015/10/13.
 * Java中内部类从属于类，Scala中内部类从属于对象
 * Scala
 */

class Outer(val name: String){outer =>
  class Inner(val name: String){
    def foo(b: Inner) = println("Outer: " + outer.name + " Inner: " +b.name)
  }
}

object OOPInScala {
  def main(args: Array[String]): Unit ={
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")
    val inner1 = new outer1.Inner("Scala")                           //构建内部类的方法。Scala中内部类从属于外部类的对象
    val inner2 = new outer2.Inner("Java")
    inner1.foo(inner1)
    inner2.foo(inner2)

    inner1.foo(inner2)                                               //这种写法不对，会报错
  }
}
