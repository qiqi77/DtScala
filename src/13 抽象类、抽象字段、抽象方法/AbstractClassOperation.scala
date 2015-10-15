package dt.scala

/**
 * Created by lenovo on 2015/10/15.
 */
class AbstractClassOps{
  var id: Int = _                                                    //普通类中，必须赋值（必须初始化）。具体值 or 占位符
                                                                     //只有var可用 _(占位符), val不可以
}

abstract class SuperTeacher(val name: String){
  var id: Int                                                           //不赋值
  var age: Int
  def teach                                                               //无方法体。不用加abstract
}

class TeacherForMaths(name: String) extends SuperTeacher(name){
  override var id = name.hashCode
  override var age = 29
  override def teach: Unit ={
    println("Teaching!!")
  }
}

object AbstractClassOperation {
  def main(args: Array[String]): Unit ={
    val teacher = new TeacherForMaths("Spark")
    teacher.teach

    println("teacher.id" + ": " + teacher.id)
    println("teacher.age" +": " + teacher.age)
  }
}
