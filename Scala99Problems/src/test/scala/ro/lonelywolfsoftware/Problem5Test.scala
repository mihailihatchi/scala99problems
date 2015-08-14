package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author mihai
 */
class Problem5Test extends FlatSpec with Matchers {

  "reverse of a list" should "create a list in revers order" in {

    Problem5.reverse(List(5, 4, 1, 2, 3)) should be(List(3, 2, 1, 4, 5))

  }

}