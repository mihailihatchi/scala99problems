package ro.lonelywolfsoftware

/**
 * @author mihai
 */
object Problem3 {
  def findNthElementOfList(n:Int, list:List[Any]): Any = list take n last
}