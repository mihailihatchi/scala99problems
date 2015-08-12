package ro.lonelywolfsoftware

import ro.lonelywolfsoftware.Problem3
import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author mihai
 */
class Problem3Test extends FlatSpec with Matchers {
  "nth element of the list" should "find nth element of the list " in {
    val n = 3
    val list = List(1, 1, 2, 3, 5, 8)
    Problem3.solve(n, list) should be(2)
  }
}