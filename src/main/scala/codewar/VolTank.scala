package main.scala.codewar

object VolTank {

  def tankVol(h: Int, d: Int, vt: Int): Int = {
    // your code
    val hless = Array(h, d - h).min // 是否高度高过半径
    val r = d/2.toFloat
    val ab = math.pow((2 * r - hless) * hless, 0.5)
    val circleArea = math.Pi * r * r
    val sectorArea = circleArea * ( math.asin(ab / r.toFloat) / math.Pi)
    val arcuateArea = sectorArea - ab * (r-hless)
    val area = h match {
      case h if h > r => circleArea - arcuateArea
      case _          => arcuateArea
    }
    println(ab * hless)
    return (area / circleArea * vt).toInt
  }
}


