package projectEuler

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MultipleCalculatorSpec extends Specification {
  

  //If we list all the natural numbers below 10 that are multiples of 3 or 5,
  // we get 3, 5, 6 and 9. The sum of these multiples is 23.


  //  Find the sum of all the multiples of 3 or 5 below 1000
  "MultiplesOf3Or5LessThan10" should {
    val multiplesOf3Or5 = new MultipleCalculator(Seq(3, 5), 10)

    "find the multiples of 3 or 5 less than 10: 3, 5, 6 and 9" in {
      multiplesOf3Or5.multiples === Seq(3, 5, 6, 9)
    }
    "sum all multiples of 3 or 5 sum 23" in {
      multiplesOf3Or5.sum === 23
    }
  }

  "MultiplesOf3Or5LessThan1000" should {
    val multiplesOf3Or5 = new MultipleCalculator(Seq(3, 5), 10)

    "find the multiples of 3 or 5 less than 1000" in {
      multiplesOf3Or5.multiples.filterNot( x => (x % 3 == 0) || (x % 5 == 0)).isEmpty
    }
  }
    
  
}
