package dt.scala

/**
 * Created by lenovo on 2015/10/15.
 */


class Person1(val name: String, var age: Int){                                            //因为有val，var，所以是Person1的成员变量
  println("The primary constructor of Person")

  val school = "PKU"

  def sleep = " 8 hours"

  override def toString = "I am a Person1!"                                                           //Object类中有toString方法。Java同样
}

class Worker(name: String, age: Int, val salary: Long) extends Person1(name, age){                                  //类声明时，填充满父类主构造器的所有参数
  println("This is the subClass of Person, Primary constructor of Worker")
  override  val school = "Spark"                                                                  //把override关键字加上

  override  def toString = "I am a Worker!" + super.sleep

}

object OverrideOperation {
  def main(args: Array[String]): Unit ={
    val w = new Worker("Spark", 5, 100000)                                              //先构造父类
    println("School: " + w.school)
    println("Salary: " + w.salary)
    println(w.toString())
  }
}
