package projectEuler

import scala.math._

/**
 * Problem 3. Largest prime factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * @see https://projecteuler.net/problem=3
 */
class LargestPrimeFactor(num:Long) {

  private def isFactor(x: Long): Boolean = {
    num % x == 0
  }

  private def isPrime(x: Long): Boolean = {
    2L until x forall( y => x % y != 0)
  }

  lazy val primeFactors = (2L to sqrt(num).toLong)
    .filter(x => isFactor(x))
    .filter(x => isPrime(x))

  lazy val result = primeFactors.max
}
