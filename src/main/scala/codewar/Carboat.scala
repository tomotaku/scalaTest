package main.scala.codewar

object Carboat {

  def howmuch(m: Int, n: Int): String = {
    // your code
    val ans = "[M: %d B: %d C: %d]"
    Range(m min n, m max n)
      .filter(_ % 9 == 1)
      .filter(_ % 7 == 2)
      .map((x: Int) => ans.format(x, x / 9, x / 7))
      .mkString
      .formatted("[%s]")
  }
}