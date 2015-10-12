package dt.scala

/**
 * Created by lenovo on 2015/10/12.
 */
class Teacher1{
  var name : String = _                    //name必须赋值，负责报错。_是占位符，没任何值。也可写成 var name : String = ""
                                           //name本身private，但是其getter和setter方法是public的。
  private var age = 27
  private[this] val gender = "male"       //只属于当前实例。

  def this(name: String){                 //定义构造器
    this                                  //不写回报错。重载构造器必须调用其它的构造器。
    this.name = name
  }

  def sayHello(): Unit ={
    println(this.name + ":" + this.age + " : " + this.gender)
  }
}

class Teacher(val name: String, val age: Int){
  println("This is the primary constructor!!!")
  var gender: String = _
  println(gender)
  def this(name: String, age: Int, gender: String){
    this(name, age)

    this.gender = gender

  }
}

//私有构造器  private。 只能调用内部重载的构造器
class Teacher2 private (val name: String, val age: Int){
  def this(name: String, age: Int, gender: String){                    //只能调用它
    this(name, age)
     //略
  }
}

object OOPInScala {
  def main(args: Array[String]): Unit ={
    val p = new Teacher1
    p.name = "Spark"                           //name的setter方法是公有的
    p.sayHello()
//    p.gender                                  //会报错。不可访问，只能内部的方法访问（自己访问自己）


    val a = new Teacher("Spark", 5)
    println(" : " + a.age)

    val b = new Teacher("Spark", 5, "male")
    println(" : " + b.age)
  }
}
