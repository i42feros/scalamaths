def calculate(n: Int, list: List[Int], limit: Int) : List[Int] = {
  if (n >= limit)
    list
  else
    calculate(list.head + n, n :: list, limit)
}


def getNumbersRecursively(number: Int): List[Int] = calculate(1, List(0), number)

getNumbersRecursively(89)