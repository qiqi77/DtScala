package dt.scala

/**
 * Created by lenovo on 2015/10/13.
 */
class University{
  val id = University.studentNo
  private var number = 0
  def aClass(number: Int){this.number += number}
}

object University{
  private var studentNo = 1
  def newStudentNo = {
    studentNo += 1
    studentNo
  }
}

object ObjectOps {
  def main(args: Array[String]): Unit ={
    println(University.newStudentNo)


    val array = Array(1,2,3,4,5)                                      //没写new。其实是用伴生对象的方式构建的。apply()
  }
}
