package spark{
  package navigation{
    private[spark] class Navigator{              //Navigator这个类的可见度 可以扩展到spark包。即
     ...                                //Navigator 对spark包中的所有子包、类、对象可见。
    
      protected[navigator] def useStart(){}       //useStart方法对于 Navigator及其子类、包navigator
                                                  //中的所有代码 都可访问
    }
  }
}

伴生类 可以随便访问 伴生对象，反之也成立。

伴生类中的protected  可以被所有子类访问，
但伴生对象没子类，所以伴生对象的protected 稍特殊。