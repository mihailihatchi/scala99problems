package ro.lonelywolfsoftware

/**
 * @author mihai
 * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */
object Problem7Flatten {
  def flatten(complexList: List[Any]): List[Any] = complexList match {
    case Nil                  => Nil
    case (h: List[_]) :: tail => flatten(h) ::: flatten(tail)
    case h :: tail            => h :: flatten(tail)
  }
}