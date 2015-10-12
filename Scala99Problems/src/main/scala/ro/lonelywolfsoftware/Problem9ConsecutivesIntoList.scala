package ro.lonelywolfsoftware

import scala.collection.mutable.ListBuffer

/**
 * @author mihai
 * If a list contains repeated elements they should be placed in separate sublists.
 *
 *
 */
object Problem9ConsecutivesIntoList {

  def compress(list: List[Any]): List[Any] = {
    def processList(listToProcess: List[Any], finalList: List[List[Any]]): List[List[Any]] = {
      if (listToProcess.isEmpty)
        finalList
      else {
        val duplicatesList = listToProcess takeWhile (_ == listToProcess.head)
        processList(listToProcess.splitAt(duplicatesList.length)._2, finalList ++ List(duplicatesList));

      }
    }
    processList(list, List[List[Any]]())
  }
}