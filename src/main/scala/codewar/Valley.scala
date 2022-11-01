package main.scala.codewar

object Valley {

  def makeValley(a: Array[Int]): Array[Int] = {
    val asorted = a.sorted
    asorted.zipWithIndex
      .filter(_._2 % 2 == asorted.length % 2)
      .map(_._1)
      .reverse ++ asorted.zipWithIndex.filter(_._2 % 2 == (asorted.length+1) % 2).map(_._1)
  }
}
