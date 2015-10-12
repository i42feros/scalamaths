package projectEuler

/**
 * Created by sonia on 09/10/2015.
 */
class FibonacciCalculator(val number: Int) {

  def calculate(n: Int, list: List[Int], limit: Int) : List[Int] = {
    if (n > limit)
      list
    else
      calculate(list.head + n, n :: list, limit)
  }



  def getNumbers(): List[Int] =  calculate(2, List(1), number).reverse

  def sumOfEvenValues() =
    getNumbers()
    .filter(x => x % 2 == 0)
    .sum




}
