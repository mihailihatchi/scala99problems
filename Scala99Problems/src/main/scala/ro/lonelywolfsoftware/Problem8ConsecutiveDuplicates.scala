package ro.lonelywolfsoftware

import scala.collection.mutable.ListBuffer

/**
 * @author mihai
 * If a list contains repeated elements they should be replaced
 * with a single copy of the element.
 * The order of the elements should not be changed.
 */
object Problem8ConsecutiveDuplicates {
  def compress(uncompressedList: List[Any]): List[Any] = {
    var finalList: ListBuffer[Any] = ListBuffer()
    var unique: Any = Nil;
    for (element <- uncompressedList) {
      if (unique == Nil) {
        //first element
        unique = element
        finalList.append(element)
      } else if (unique != element) {
        //if we found a new number
        unique = element
        finalList.append(element)
      } else {
        println("found a duplicate " + element + "ignoring")
      }

    }

    finalList.toList
  }

}