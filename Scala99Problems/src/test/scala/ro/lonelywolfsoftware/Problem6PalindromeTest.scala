package ro.lonelywolfsoftware

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author mihai
 */
class Problem6PalindromeTest extends FlatSpec with Matchers {
  "a palindrome " should "not list which is not equal to itself in reverse" in {
    Problem6Palindrome.isPalindrome(List(1, 2, 3)) should be(false)
  }
  "a palindrome " should "a list which is equal to itself in reverse" in {
    Problem6Palindrome.isPalindrome(List(1, 2, 3, 2, 1)) should be(true)

  }
  "an empty list " should "be a palindrome" in {
    Problem6Palindrome.isPalindrome(List()) should be(true)
  }
}