package main.scala.codewar

import scala.annotation.tailrec

object IrreducibleSumofRationals {
  @tailrec
  def gcd(a: Long, b: Long): Long = {
    if (b == 0) a else gcd(b, a % b)
  }
  def sumFracts(lst: Array[(Long, Long)]): String = {
    // your code
    val lst1 = lst
      .foldLeft((0L, 1L)) { case ((n1, d1), (n2, d2)) =>
        ((n1 * d2 + n2 * d1)/gcd(n1 * d2 + n2 * d1,d1 * d2), (d1 * d2)/gcd(n1 * d2 + n2 * d1,d1 * d2))
      }
    val gcd1 = gcd(lst1._1,lst1._2)
    if (lst1._1==0){return "0"}
    if (lst1._1%lst1._2==0){return "[%d]".format(lst1._1/lst1._2)}
    "[%d, %d]".format(lst1._1,lst1._2)
  }
}