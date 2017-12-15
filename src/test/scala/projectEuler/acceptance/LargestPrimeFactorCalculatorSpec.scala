package projectEuler.acceptance

import org.scalatest.{Matchers, WordSpec}
import projectEuler.LargestPrimeFactorCalculator

class LargestPrimeFactorCalculatorSpec extends WordSpec with Matchers {

  "Result" when {
    val number: Long = 600851475143L
    "calculate the largest prime factor of the given number: " + number should {
      val expected: Option[Long] = Some(6857L)
      "return " + expected in {
        val largestPrimeFactor = new LargestPrimeFactorCalculator(number)
        largestPrimeFactor.result should equal(expected)
      }
    }
  }
}
