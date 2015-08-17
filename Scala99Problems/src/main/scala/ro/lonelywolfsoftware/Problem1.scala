package ro.lonelywolfsoftware

/**
 * @author mihai
 * (*) Find the last element of a list.
 * Example:
 * scala> last(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 8
 */
object Problem1 {
  def findLast(list: List[Any]): Any = list.last
}