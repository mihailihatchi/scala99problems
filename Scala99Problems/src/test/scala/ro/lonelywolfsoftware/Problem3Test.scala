package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * P03 (*) Find the Kth element of a list.
 * By convention, the first element in the list is element 0.
 * Example:
 *
 * scala> nth(2, List(1, 1, 2, 3, 5, 8))
 * res0: Int = 2
 * @author mihai
 */
class Problem3Test extends FlatSpec with Matchers {
  "nth element of the list" should "find nth element of the list " in {
    val n = 3
    val list = List(1, 1, 2, 3, 5, 8)
    Problem3.findNthElementOfList(n, list) should be(2)
  }
}