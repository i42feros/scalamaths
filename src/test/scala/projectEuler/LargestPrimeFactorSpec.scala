package projectEuler

import org.specs2.mutable.Specification

/**
 * Created by sonia on 12/10/2015.
 */
class LargestPrimeFactorSpec extends Specification {

  "LargestPrimeFactorSpec" should {
    val largestprimeFactor = new LargestPrimeFactor(13195)
    "calculate primeFactors should be 5, 7, 13 and 29" in {
      largestprimeFactor.primeFactors == IndexedSeq(5, 7, 13, 29)
    }

    "give as result the largest factor" in {
      largestprimeFactor.result == 29
    }

  }
}
