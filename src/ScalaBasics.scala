package exercise.sqlPaper

/**
 * Created by lenovo on 2015/10/9.
 */
object ScalaBasics {

  //函数1
/*  def doWhile(): Unit ={
    var line = ""
    do{
      line = readLine()    //可以多次输入。结束方法：什么都不输入，直接按回车，即可结束。
      println("Read: " + line)
    }while(line != "")
  }*/

  //函数2
  def looper(x: Long, y:Long): Long = {
    var a = x
    var b = y
    while(a != 0){
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  //5.
  var line = ""
  do{
    println("Please input some words blow ...")
    line = readLine()
    println("Read: " + line)
  }while(line != "")

  def main(args: Array[String]){
    //函数1
//    doWhile

    //函数2
//    println(looper(100, 298))

    //3.判断
//    var file = "scala.txt"
    val file = if(!args.isEmpty) args(0) else "scala.txt"
    println(file)

    println(if(!args.isEmpty) args(0) else "scala.txt")

    //4.for循环
    for(i <- 1 to 10){
      println("Nuber is: " + i)
    }

    for(i <- 1.to(10)){     //Scala中一切皆对象
      println("Number is : " + i)
    }

    val files = (new java.io.File(".")).listFiles()  //找当前目录下所有文件
    for(file <- files){    //增强for循环
      println(file)
    }



    //7.异常
    val n = 99
//    val flie = "Spark.txt"
//    openFile(file)
    try{
      val half = if(n % 2 ==0) n/2 else throw
        new RuntimeException("N must be event")
      //Use the file
    }catch {
      case e: Exception => println("The exception is :" + e.getMessage)
    }finally{
//      close(file)
    }
  }




}
