package ro.lonelywolfsoftware
import org.scalatest.FlatSpec
import org.scalatest.Matchers
class Problem2Test extends FlatSpec with Matchers {

  " second to Last element " should "find second to last element of a list" in {

    val list = List(1, 1, 2, 3, 5, 8)
    Problem2.solve(list) should be(5)
  }

}