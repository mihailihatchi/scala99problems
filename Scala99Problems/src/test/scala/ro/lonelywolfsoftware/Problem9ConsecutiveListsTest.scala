package ro.lonelywolfsoftware

import org.scalatest.Matchers
import org.scalatest.FlatSpec

/**
 * @author mihai
 */
class Problem9ConsecutiveListsTest extends FlatSpec with Matchers {

  "consecutive duplicates list implementation" should "put consecutive duplicates in their list " in {
    val inputList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val expectedResult = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    Problem9ConsecutivesIntoList.compress(inputList) should be(expectedResult)
  }

}