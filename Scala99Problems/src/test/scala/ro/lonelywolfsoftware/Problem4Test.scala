package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author mihai
 */
class Problem4Test extends FlatSpec with Matchers {
  "length of the list" should "find number of elements " in {
    val list = List(1, 1, 2, 3, 5, 8)
    Problem4.length(list) should be(6)
  }
}