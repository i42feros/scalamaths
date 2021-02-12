package projectEuler


object Application {
  def main(args: Array[String]): Unit = {
    val multipleCalculator3or5 = new MultipleCalculator(Seq(3,5), 1000)
    println("Problem 1. Find the sum of all the multiples of 3 or 5 below 1000")
    println(s"Result: ${multipleCalculator3or5.sum}")

    println("*-*-*--*-*-*-*-*-* *-*-*--*-*-*-*-*-*")
    val fibonacciCalculator = new FibonacciCalculator(4000000)
    println("Problem 2. By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.")
    println(s"Result: ${fibonacciCalculator.sumOfEvenValues}")

    println("*-*-*--*-*-*-*-*-* *-*-*--*-*-*-*-*-*")
    val number = 600851475143L
    val largestPrimeFactor = new LargestPrimeFactorCalculator(number)
    println(s"Problem 3. What is the largest prime factor of the number $number?")
    println(s"Result: ${largestPrimeFactor.result}")

    val largestPalindromeProduct = new LargestPalindromeProduct(100,999)
    println("Problem 4. Find the largest palindrome made from the product of two 3-digit numbers.")
    println("Result: " + largestPalindromeProduct.maxPalindrome)

    println("*-*-*--*-*-*-*-*-* *-*-*--*-*-*-*-*-*")
    val start: Int = 1
    val end: Int = 20
    val smallestMultipleCalculator = new SmallestMultipleCalculator(start, end)
    println(s"Problem 5. What is the smallest positive number that is evenly divisible by all of the numbers from $start to $end?")
    println(s"Result: ${smallestMultipleCalculator.smallestMultiple}")

  }

}
