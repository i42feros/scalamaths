package projectEuler

import org.scalatest.{Matchers, WordSpec}

class SmallestMultipleCalculatorSpec extends WordSpec with Matchers {

  def smallestMultipleTest(description: String, start: Int, end: Int, expected: Option[Int]) = {
    "smallestMultiple" when {
      s"$description, range = [$start, $end]" should {
        s"return $expected" in {
          val smallestMultipleCalculator = new SmallestMultipleCalculator(start, end)
          smallestMultipleCalculator.smallestMultiple should equal(expected)
        }
      }
    }
  }

  smallestMultipleTest("calculate the smallest multiple in a given range and exists at least one result", 1, 10, Some(2520))
  smallestMultipleTest(s"calculate the smallest multiple in a given range and no result found in the first ${Int.MaxValue}th integers", 1, 25, None)

}
