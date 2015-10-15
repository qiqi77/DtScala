package dt.scala

/**
 * Created by lenovo on 2015/10/13.
 */
class ApplyTest{
  def apply() = println("hehe  hehe")

  def haveATry: Unit ={
    println("Have a try on apply!")
  }
}

object ApplyTest{
  def apply() = {                                     //复写apply方法
    println("he he he")
    new ApplyTest                                     //创建了class ApplyTest的一个实例
  }
}

object ApplyOperation extends App{
    val array = Array(1,2,3,4,5)                        //没有new,其实调用的是object Aprray中的apply方法。   构建集合时，多用伴生对象中的apply方法来构建 类的实例
    val a = ApplyTest()                                //用的是object Apply
    a.haveATry                                         //因为object ApplyTest中有new ApplyTest。           这儿也没new，实际焦勇的是object ApplyTest中的apply方法

  //apply也可以在类中
  val b = new ApplyTest
  b.haveATry
  println(a())                                  //调用class中的applyy方法。a后面加个括号。
  println(a)                                    //不加括号，就是对象的地址
                                                //更常用的还是 用 伴生对象(object)的apply方法  类的对象
}
