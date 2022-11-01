import main.scala.codewar.DirReduction

object DirReductionTest {
  def main(args: Array[String]) {
    println(
      DirReduction
        .dirReduc(
          Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
        )
        .mkString(",")
    )
  }
}
