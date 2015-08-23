package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author mihai
 */
class Problem7FlattenTest extends FlatSpec with Matchers {
  "flatten method " should "return a flat list of the structure" in {
    Problem7Flatten.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be(List(1, 1, 2, 3, 5, 8));

  }
}