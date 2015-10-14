package projectEuler

import org.specs2.mutable.Specification

class LargestPalindromeProductTest extends Specification {

  "LargestPalindromeProductTest from 10 to 99" should {
    val palindromeProduct = new LargestPalindromeProduct(10, 99)

    "maxPalindrome should be 9009" in {
      palindromeProduct.maxPalindrome === 9009
    }

  }
}
