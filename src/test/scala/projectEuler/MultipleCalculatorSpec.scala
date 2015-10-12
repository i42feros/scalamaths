package projectEuler

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MultipleCalculatorSpec extends Specification {

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
    val multiplesOf3Or5 = new MultipleCalculator(Seq(3, 5), 1000)

    "find the multiples of 3 or 5 less than 1000" in {
      multiplesOf3Or5.multiples.filterNot( x => (x % 3 == 0) || (x % 5 == 0)).isEmpty
    }
    "sum all multiples of 3 or 5 sum 233168" in {
      multiplesOf3Or5.sum === 233168
    }
  }
    
  
}
