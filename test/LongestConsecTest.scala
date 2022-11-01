object LongestConsecTest {
  def main(args: Array[String]): Unit = {
    println(
      longestConsec(
        Array(
          "zone",
          "abigail",
          "theta",
          "form",
          "libe",
          "zas",
          "theta",
          "abigail"
        ),
        2
      )
    )
    println(
      longestConsec(
        Array(
          "ejjjjmmtthh",
          "zxxuueeg",
          "aanlljrrrxx",
          "dqqqaaabbb",
          "oocccffuucccjjjkkkjyyyeehh"
        ),
        3
      )
    )
    println(
      longestConsec(Array(), 3)
    )
  }
}
