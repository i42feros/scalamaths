package projectEuler

/**
 * Problem 6. The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * @param limit
 */
case class SumSquareDifference(limit: Int) {
  val range = (1 to limit)

  private def square(x: Int): Int = x * x

  private def sumOfSquares: Int = range.map(x => square(x)).sum

  private def squareOfSum: Int = square(range.sum)

  def result: Int = squareOfSum - sumOfSquares
}
