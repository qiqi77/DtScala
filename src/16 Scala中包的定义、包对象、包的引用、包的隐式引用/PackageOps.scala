package dt.scala

/**
 * Created by lenovo on 2015/10/17.
 */
package com.scala.spark
package object people{
  val defaultName = "Scala"
}

package people{
  class people{
    var name = defaultName
  }
}

class PackageOps{}

package spark.navigation{
  abstract class Navigator{
    def act
  }
  package tests{
    //在spark.navigation.tests包里
    class NavigatorSuite
  }

  package impls{
    class Action extends Navigator{                 //定义 和 具体实现分开
      def act = println("Action")
    }
  }
}

package hadoop{
  package navigation{
    class Navigator
  }

  package launch{
    class Booster{
      val nav = new navigation.Navigator               //两个包同属于一个大包，所以可以互相访问
    }
  }
}











object PackageOps {
  def main(args: Array[String]): Unit ={

  }
}
