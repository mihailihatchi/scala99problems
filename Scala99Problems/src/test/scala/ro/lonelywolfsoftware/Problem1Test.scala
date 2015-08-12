
package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest._
class Problem1Test extends FlatSpec with Matchers {

  "Last element " should "find last element of a list" in {

    val list = List(1, 2, 3, 4);
    Problem1.solve(list) should be(4)
  }

}