package main.scala.codewar

import scala.collection.mutable.{ListBuffer, Map}
object EnoughIsEnough {
  def deleteNth(elements: List[Int], maxOccurrences: Int): List[Int] = {
    // Code here
    var elementsReturn = ListBuffer[Int]()
    var elementsDict: Map[Int, Int] = Map()
    for (i <- 0 until elements.length) {
      if (elementsDict.contains(elements(i)))
        (
          elementsDict(elements(i)) += 1
        )
      else (elementsDict(elements(i)) = 1)
      if (elementsDict(elements(i)) <= maxOccurrences)(      
        elementsReturn += elements(i)
      )

    }
    return elementsReturn.toList
  }
}

