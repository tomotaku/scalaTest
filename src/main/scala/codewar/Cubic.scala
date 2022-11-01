package main.scala.codewar

object Cubes {

  def isSumOfCubes(s: String): String = {
    // 153 is such a "cubic" number : 1^3 + 5^3 + 3^3 = 153
    val cubes = (0 to 1000)
      .filter((x: Int) =>
        x.toString.split("").map(_.toInt).map(math.pow(_, 3)).sum == x
      )
      .toList
    val sFiltered =
      "\\D+".r.split(s).map(_.grouped(3).toArray).flatten.map(_.toInt).toList
    val isMatch: List[Int] = sFiltered.filter(cubes.contains(_))
    if (isMatch.length == 0) {
      return "Unlucky"
    } else {
      return isMatch.mkString(" ") ++ isMatch.sum.toString ++ "Lucky"
    }
  }
}
