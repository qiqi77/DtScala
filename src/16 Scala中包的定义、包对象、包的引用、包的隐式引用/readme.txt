可以在包中定义包对象，那么包中所有的类 都可以直接访问 包对象中的所有成员和方法。
言外之意，包本身不可以定义成员、方法等，所以借用了 包对象。

包，可以把类的定义 和实现分开。

import java.lang._
import scala._
import Predef._

命别名：
别名：
import java.util.{HashMap => JavaHashMap} //有时Java和Scala中会有同名的，此时可 设置个别名

隐藏：
import scala.{StringBuilder => _}              //用了下划线，把scala包中的StringBuilder 隐藏掉了






