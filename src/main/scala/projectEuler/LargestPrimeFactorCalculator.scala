package projectEuler

import scala.math._

/**
 * Problem 3. Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @see https://projecteuler.net/problem=3
 */
class LargestPrimeFactorCalculator(num: Long) {

  private def isFactor(numerator: Long)(denominator: Long): Boolean = {
    numerator % denominator == 0
  }

  private def isPrime(number: Long): Boolean = {
    !(2L until number exists isFactor(number))
  }

  private lazy val primeFactors: Seq[Long] = (2L to sqrt(num).toLong)
    .filter(isFactor(num))
    .filter(isPrime)

  lazy val result: Option[Long] = if(primeFactors.isEmpty) None else Some(primeFactors.max)
}
