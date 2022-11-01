package main.scala.codewar

import scala.collection.mutable.ListBuffer

object EnoughIsEnough {
  def deleteNth(elementsToDel: List[Int], maxOccurrences: Int): List[Int] = {
    // Code here
    val elementsReturn = ListBuffer[Int]()
    var elementsDict: Map[Int, Int] = Map()
    for (i <- elementsToDel.indices) {
      if (elementsDict.contains(elementsToDel(i))) {
        elementsDict += (elementsToDel(i)->(elementsDict(elementsToDel(i))+1))
      }
      else {
        elementsDict += (elementsToDel(i)->1)
      }
      if (elementsDict(elementsToDel(i)) <= maxOccurrences) {
        elementsReturn += elementsToDel(i)
      }
    }
    elementsReturn.toList
  }
}
