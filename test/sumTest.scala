import main.scala.codewar.IrreducibleSumofRationals._

object sumTest {
  def main(args: Array[String]): Unit = {
    var lst: Array[(Long, Long)] = Array((1, 3), (5, 3))
    println(
      sumFracts(lst)
    )
  }
}