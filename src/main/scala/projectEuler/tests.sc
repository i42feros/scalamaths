def isPalindrome(text: String): Boolean = text == text.reverse

val palindromes :Seq[Int] = for {
    x <- 100 until 999
    y <- x until 999
  } yield  x * y

val maxPalindrome = palindromes
  .filter(n => isPalindrome(n.toString()))
  .sortWith((x, y) => x > y)
  .head
//580085
//906609