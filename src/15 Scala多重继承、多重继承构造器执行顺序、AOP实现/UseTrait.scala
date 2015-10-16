package dt.scala

/**
 * Created by lenovo on 2015/10/16.
 */


trait Logger{
  def log1(msg: String){}                                                     //空。trait可以有普通方法（与Java不同）
  def log(msg: String)                                                      //没有实现。抽象方法
}

class ConcreteLogger extends Logger with Cloneable{                                                  //实现多个用with
  override def log(msg: String) = println("Log: " + msg)                                              //抽象的可以不写overr，具体实现的 必须写

  def concreteLog{
    log("It's me !!!")
  }
}

trait TraitLogger extends Logger{
  override def log(msg: String): Unit ={
    println(" TraitLoger Log content is : " + msg)
  }
}

trait TraitLoggered{
  def loged(msg: String): Unit ={
    println("TraitLoggered Log content is : " + msg)
  }
}

trait ConsoleLogger extends TraitLogger{                                       //trait继承自trait
  override def log(msg: String): Unit ={
    println("Log from Console : " + msg)
  }
}

class Test extends ConcreteLogger{
  def test: Unit ={
    log("Here is Spark!!!")
  }

}

abstract class Account{
  def save
}

class MyAccount extends Account with ConsoleLogger{
  def save: Unit ={
    log("11")
  }
}

class Human{
  println("Human")
}
trait TTeacher extends Human{
  println("TTeacher")
  def teach                                                                                //抽象方法
}
trait PianoPlayer extends Human{
  println("PianoPlayer")
  def playPiano = {println("I'm playing piano. ")}                                         //具体方法
 }
class PianoTeacher extends Human with TTeacher with PianoPlayer{                             //对象中混入trait
  override def teach = {println("I'm training students. ")}
}

//APO
trait Action{
  def doAction
}
trait TBeforeAfter extends Action{
  abstract override def doAction: Unit ={
    println("Initialization")
    super.doAction
    println("Destroyed")
  }
}

class Work extends Action{
  override def doAction = println("Working...")
}

object UseTrait extends App{
//  方法1
  val t1 = new PianoTeacher                         //注意构造顺序：由左往右构造。2）前面父类被构造过之后，不再重复构造
  t1.playPiano
  t1.teach

  //方法2,直接new Human
 val t2 = new Human with TTeacher with PianoPlayer{
    def teach = {println("I'm teaching students. ")}                                  //不重写该抽象方法，就会报错     （等号右边实际是个匿名类）
  }
  t2.playPiano
  t2.teach


  //3.
  val work = new Work with TBeforeAfter                                        //从左往右构建
  work.doAction
}
