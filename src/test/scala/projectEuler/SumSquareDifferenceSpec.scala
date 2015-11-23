package projectEuler

import org.scalatest.{Matchers, WordSpec}


class SumSquareDifferenceSpec extends WordSpec with Matchers {

  "Result of the difference between the sum of the squares " when {
    val limit = 10
    s"the first $limit natural numbers and the square of the sum" should {
      val expected = 2640
      val sumSquaredDifferenceSpec = new SumSquareDifference(limit)

      s"return $expected" in {
        sumSquaredDifferenceSpec.result should equal(expected)
      }
    }
  }

  "Result of the difference between the sum of the squares " when {
    val limit = 100
    s"the first $limit natural numbers and the square of the sum" should {
      val expected = 25164150
      val sumSquaredDifferenceSpec = new SumSquareDifference(limit)

      s"return $expected" in {
        sumSquaredDifferenceSpec.result should equal(expected)
      }
    }
  }

}
