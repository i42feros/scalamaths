package projectEuler

import org.scalatest.{Matchers, WordSpec}


class LargestPrimeFactorCalculatorSpec extends WordSpec with Matchers {

  "Result" when {
    val number: Int = 13195
    "calculate the largest prime factor of a number: " + number should {
      val expected: Option[Long] = Some(29)
      "return " + expected in {
        val largestPrimeFactor = new LargestPrimeFactorCalculator(number)
        largestPrimeFactor.result should equal(expected)
      }
    }
  }

  "Result" when {
    val number: Int = 29
    "calculate the largest prime factor of a prime number: " + number should {
      val expected: Option[Long] = None
      "return " + expected in {
        val largestPrimeFactor = new LargestPrimeFactorCalculator(number)
        largestPrimeFactor.result should equal(expected)
      }
    }
  }

  "Result" when {
    val number: Long = 1
    "calculate the largest prime factor of an outbound number: " + number should {
      val expected: Option[Long] = None
      "return " + expected in {
        val largestPrimeFactor = new LargestPrimeFactorCalculator(number)
        largestPrimeFactor.result should equal(expected)
      }
    }
  }
}
