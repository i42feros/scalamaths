package projectEuler

/**
 * Problem 4. Largest palindrome product
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * @see https://projecteuler.net/problem=4
 */
class LargestPalindromeProduct(lowerLimit: Int, upperLimit: Int) {
  private def isPalindrome(text: String): Boolean = text == text.reverse

  private lazy val valuesToExplore :Seq[Int] = for {
    x <- lowerLimit to upperLimit
    y <- x to upperLimit
  } yield  x * y

  val maxPalindrome = valuesToExplore
    .filter(n => isPalindrome(n.toString()))
    .max

}
