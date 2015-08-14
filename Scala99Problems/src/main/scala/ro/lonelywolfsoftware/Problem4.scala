package ro.lonelywolfsoftware

/**
 * @author mihai
 * /**  Find the number of elements of a list.
 * Example:
 * scala> length(List(1, 1, 2, 3, 5, 8))
 * res0: Int = 6
 *
 * */
 *
 */
object Problem4 {
  def length(list: List[Any]): Int = list match {
    case List()                      => 0
    case (x: Any) :: (xs: List[Any]) => 1 + length(xs)
    case _                           => 0
  }
}