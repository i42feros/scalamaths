package projectEuler

import org.specs2.mutable.Specification


class FibonacciCalculatorSpec extends Specification {
  "FibonacciCalculator" should {
    val fibonacciTo89 = new FibonacciCalculator(89)

    "return a Fibonacci sequence of the numbers up to 89" in {
      fibonacciTo89.getNumbers() == Seq(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    }

    "return the sum of Fibonacci sequence of only the even number up to 89" in {
      fibonacciTo89.sumOfEvenValues() == 44
    }
  }
}
