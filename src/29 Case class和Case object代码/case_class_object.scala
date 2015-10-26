package dt.scala

/**
 * Created by lenovo on 2015/10/26.
 */
abstract class Person
case class Student(age: Int) extends Person                                        //没有指明类型，则默认是val。不可改变。消息传递
case class Worker(age: Int, salary: Double) extends Person
case object Shared extends Person

object case_class_object {
  def main(args: Array[String]): Unit ={
    def caseOps(person: Person) = person match{
      case Student(age) => println("I am " + age + " years old")
      case Worker(_, salary) => println("Wow, I got " + salary)
      case Shared => println("No property")
    }
    caseOps(Student(19))
    caseOps(Shared)

    val worker = Worker(29, 10000.1)
    val worker2 = worker.copy(salary = 19.95)                                             //可以换新值
    val worker3 = worker.copy(age = 30)
    caseOps(worker2)
    caseOps(worker)                                                                      //worker本身没变

  }
}
