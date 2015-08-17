package ro.lonelywolfsoftware

/**
 *
 * @author mihai
 * scala> reverse(List(1, 1, 2, 3, 5, 8))
 * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 *
 */
object Problem5 {
  def reverse(list: List[Any]): List[Any] = list match {
    case List(x: Any)                => List(x)
    case (x: Any) :: (xs: List[Any]) => reverse(xs):+x
    case _                           => List()
  }
}