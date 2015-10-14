package projectEuler

import org.scalatest.{Matchers, WordSpec}

class LargestPrimeFactorCalculatorSpec extends WordSpec with Matchers {

  def testResult(description: String, number: Long, expected: Option[Long]) = {
    "Result" when {
       s"$description, number = $number" should {
        "return " + expected in {
          val largestPrimeFactor = new LargestPrimeFactorCalculator(number)
          largestPrimeFactor.result should equal(expected)
        }
      }
    }
  }

  testResult("calculate the largest prime factor of a number", 13195L, Some(29))
  testResult("calculate the largest prime factor of a prime number", 29L, None)
  testResult("calculate the largest prime factor of an outbound number", 1L, None)

}
