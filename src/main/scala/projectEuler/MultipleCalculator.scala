package projectEuler

/**
 * Problem 1. Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @see https://projecteuler.net/problem=1
 */
class MultipleCalculator(val factors : Seq[Int], val limit: Int) {
//  lazy val multiples: Set[Int] = {
//    (for {
//      number <- 1 until limit
//      factor <- factors if number % factor == 0
//    } yield number).toSet
//  }

  val values = 1 until limit

  def isDivisibleByNFactor(x: Int): Boolean = factors.map(x % _ == 0).reduceLeft(_ || _)

  val multiples: Seq[Int] = values.filter(isDivisibleByNFactor)

  lazy val sum = multiples.sum

}

