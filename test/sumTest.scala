import main.scala.codewar.Fracts

object sumTest {
  def main(args: Array[String]) {
    var lst: Array[(Long, Long)] = Array((1, 3), (5, 3))
    println(
      `Fracts`
        .sumFracts(lst)
    )
  }
}