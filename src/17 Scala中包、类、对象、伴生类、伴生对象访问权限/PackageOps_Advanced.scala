package dt.scala

/**
 * Created by lenovo on 2015/10/17.
 */
package spark{
  package navigation{
    private[spark] class Navigator{                                    //
      protected[navigation] def useStarChart(){}                       //
      class LegOfJourney{
        private[Navigator] val distance = 100
      }
      private[this] var speed = 200
    }
  }

  package launch{
    import navigation._                                                      //这句话必须得加，不加会报错
    object Vehicle{
      private[launch] val guide = new Navigator                           //Navigator类在navigation包中
    }
  }
}

class PackageOps_Advanced{
  import PackageOps_Advanced.power

  private def canMakeItTrue = power > 10001
}



object PackageOps_Advanced {
  private def power = 10000

  def makeItTrue(p: PackageOps_Advanced): Boolean={
    val result = p.canMakeItTrue
    result
  }
}
