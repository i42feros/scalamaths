package projectEuler

/**
 * Problem 5. Smallest multiple
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * @see https://projecteuler.net/problem=5
 */
class SmallestMultipleCalculator(startDivisibilityRange: Int, endDivisibilityRange: Int) {

  private def isDivisible(numerator : Int, denominator: Int) : Boolean = numerator % denominator == 0

  private def isDivisibleByAllRange(number: Int): Boolean = Range.inclusive(startDivisibilityRange, endDivisibilityRange).forall(isDivisible(number, _))

  lazy val smallestMultiple: Option[Int] = (Range.inclusive(1, Integer.MAX_VALUE)).find(isDivisibleByAllRange)
}
