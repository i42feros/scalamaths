package projectEuler

/**
 * Created by sonia on 09/10/2015.
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

