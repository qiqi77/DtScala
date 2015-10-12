package dt.scala

/**
 * Created by lenovo on 2015/10/12.
 */
class Person{                                        //没加public。默认都是public
  private var age = 0
  def increment(){age += 1}
  def current = age


}

class Student{
//  var age = 0                               //Scala默认会生成getter和setter，且age是private级别的

  private var privateAge = 0
  val name = "Scala"                          //不可变。没有setter方法
  def age = privateAge

  def isYounger(other: Student) = privateAge < other.privateAge      //类中


  private[this] var parivateAge1 = 0   //只能类自己的方法 能访问自己的对象，不能访问其它对象中的这个属性。当前对象私有
}

object HelloOOP {
  def main(args: Array[String]){
    val person = new Person()
    person.increment()
    person.increment()
    println(person.current)

    val student = new Student
    student.age = 10
    println(student.age)                   //def age: Int     所以age是个函数


    val stu = new Student
    stu.name = 1                         //此句会报错。不能赋值
    println(stu.name)

  }
}
