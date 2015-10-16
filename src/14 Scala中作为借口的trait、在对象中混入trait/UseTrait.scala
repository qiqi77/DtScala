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

class MyAccount extends Account with ConsoleLogger{
  def save: Unit ={
    log("11")
  }
}

abstract class Account{
  def save
}
object UseTrait extends App{
  val logger = new ConcreteLogger with TraitLogger                                  //对象混入，可以修改trait的默认行为。与西一句注释掉的 对比 打印差别
//  val logger = new ConcreteLogger
  logger.concreteLog

  val logger1 = new Test
  logger1.test

  val account = new MyAccount with TraitLoggered
  account.save

}
