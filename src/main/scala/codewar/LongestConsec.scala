package main.scala.codewar

object LongestConsec {

  def longestConsec(strarr: Array[String], k: Int): String = {
    strarr
      .distinct
      .sliding(k)  
      .toList
      .map(_.mkString)
      .foldLeft("")((a1, b1) => if (b1.length > a1.length) b1 else a1)
  }
}
