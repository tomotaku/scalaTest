package main.scala.codewar

object Sol {

  def fib(n: Int): BigInt = {
    // your code here
    var first:BigInt = 0
    var second:BigInt = 1
    n match {
      case 0 | 1 => n
      case _ =>
        for (i <- 0 until n-1) {
          var mid = second
          second = first + second
          first = mid
        }
        second
    }
  }
// import scala.math.pow
// object Solution {
//   def zeros(n: Int): Int = LazyList.from(1).map(pow(5,_)).takeWhile(n/_ >= 1).map(x => (n/x).toInt).sum
// }

}

