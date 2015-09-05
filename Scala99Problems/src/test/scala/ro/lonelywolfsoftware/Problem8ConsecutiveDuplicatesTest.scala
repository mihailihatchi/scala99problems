package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author mihai
 */
class Problem8ConsecutiveDuplicatesTest extends FlatSpec with Matchers {
  "consecutive duplicates implementation" should "eliminate consecutive duplicates" in {
    Problem8ConsecutiveDuplicates.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should be(List('a, 'b, 'c, 'a, 'd, 'e))
  }
}