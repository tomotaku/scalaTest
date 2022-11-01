package main.scala.codewar

object Opstrings {
 
  private def stringTrans(strng: String): Array[String] = {
    strng.split("\n")
  }
  def diag1Sym(strng: String): String = {
    stringTrans(strng).map(_.split("")).transpose.mkString("\n")
  }
  def rot90Clock(strng: String): String = {
    val s_new = strng.split("\n")
    stringTrans(strng).map(_.split("")).reverse.transpose.mkString("\n")
  }
  def selfieAndDiag1(strng: String): String = {
    strng.zip(stringTrans(strng)).map(x => x._1+"|"+x._2).mkString("\n")
  }
  def oper(f: String => String, s: String): String =f(s)
}