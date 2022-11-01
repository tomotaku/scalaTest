package main.scala.codewar

object DirReduction {
  def dirReduc(arr: Array[String]): Array[String] = {
    // your code
    val opposite = Map(
      "NORTH" -> "SOUTH",
      "SOUTH" -> "NORTH",
      "EAST" -> "WEST",
      "WEST" -> "EAST"
    )
    val newArr:Array[String] = " " +: arr
    newArr
      .map(s => Array(s))
      .reduce((x, y) =>
        if (x.last != opposite(y.mkString)) x ++ y else x.slice(0, x.length - 1)
      )
  }.tail
  def dirReducSilly(arr: Array[String]): Array[String] = {
    // your code
    val opposite = Map(
      "NORTH" -> "SOUTH",
      "SOUTH" -> "NORTH",
      "EAST" -> "WEST",
      "WEST" -> "EAST"
    )
    if (arr.length == 0) return Array("")
    if (arr.length == 1) return arr
    var point = 0
    var before = arr(point)
    var after = arr(point + 1)
    if (before != opposite(after)) {
      return Array(before)++dirReducSilly(arr.slice(1, arr.length))
    }
    return dirReducSilly(arr.slice(2, arr.length))
  }
}

