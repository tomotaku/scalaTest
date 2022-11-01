import main.scala.codewar.EnoughIsEnough

object EnoughIsEnoughTest {
  def main(args: Array[String]) {
    println(
      EnoughIsEnough
        .deleteNth(
          List(20, 37, 20, 21),
          1
        )
        .mkString(",")
    )
  }
}
