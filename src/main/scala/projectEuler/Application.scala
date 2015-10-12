package projectEuler


object Application {
  def main(args: Array[String]): Unit = {
    val multipleCalculator3or5 = new MultipleCalculator(Seq(3,5), 1000)
    println("Problem 1. Find the sum of all the multiples of 3 or 5 below 1000")
    println("Result: " + multipleCalculator3or5.sum)

    println("*-*-*--*-*-*-*-*-* *-*-*--*-*-*-*-*-*")
    val fibonacciCalculator = new FibonacciCalculator(4000000)
    println("Problem 2. By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.")
    println("Result: " + fibonacciCalculator.sumOfEvenValues)

    println("*-*-*--*-*-*-*-*-* *-*-*--*-*-*-*-*-*")
    val largestPrimeFactor = new LargestPrimeFactor(600851475143L)
    println("Problem 3. What is the largest prime factor of the number 600851475143?")
    println("Result: " + largestPrimeFactor.result)

  }

}
