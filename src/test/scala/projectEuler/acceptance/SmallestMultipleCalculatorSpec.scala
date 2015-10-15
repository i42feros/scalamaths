package projectEuler.acceptance

import org.scalatest.{Matchers, WordSpec}
import projectEuler.SmallestMultipleCalculator

class SmallestMultipleCalculatorSpec extends WordSpec with Matchers {

    "smallestMultiple" when {
      val expected = Some(232792560)
      val start = 1
      val end = 20
      s"calculate the smallest multiple in the given range [$start, $end]" must {
        s"return $expected" in {
          val smallestMultipleCalculator = new SmallestMultipleCalculator(start, end)
          smallestMultipleCalculator.smallestMultiple should equal(expected)
        }
      }

    }
}
