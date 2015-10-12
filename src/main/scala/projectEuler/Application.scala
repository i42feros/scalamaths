package projectEuler


object Application {
  def main(args: Array[String]): Unit = {
    val multipleCalculator3or5 = new MultipleCalculator(Seq(3,5), 1000)
    println("Problem 1. Find the sum of all the multiples of 3 or 5 below 1000")
    println("Multiples: " + multipleCalculator3or5.multiples)
    println("Result: " + multipleCalculator3or5.sum)

    val fibonacciCalculator = new FibonacciCalculator(4000000)
    println("Problem 2. By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.")
    println("Result: " + fibonacciCalculator.sumOfEvenValues)

  }

}