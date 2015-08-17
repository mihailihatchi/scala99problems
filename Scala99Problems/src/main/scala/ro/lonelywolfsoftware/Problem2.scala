package ro.lonelywolfsoftware

/**
 * @author mihai
 * P02 (*) Find the last but one element of a list.
 * Example:
 * scala> penultimate(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 5
 */
object Problem2 {
  def penultimate(list: List[Any]): Any = list.reverse.tail.head
}