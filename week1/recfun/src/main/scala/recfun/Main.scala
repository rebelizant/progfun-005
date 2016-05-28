package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

   /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def factorial(x: BigInt): BigInt = {
      def factIter(acc: BigInt, x: BigInt): BigInt = if (x == 0) acc else factIter(acc * x, x - 1)
      factIter(1, x)
    }
    (factorial(r) / (factorial(c) * factorial(Math.abs(r - c)))).toInt
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance(counter: Int, chars: List[Char]): Boolean = {
      if (counter < 0) false
      else if (chars.isEmpty) counter == 0
      else balance(counter + charNum(chars.head), chars.tail)
    }
    def charNum(char: Char): Int = {
      char match {
        case '(' => 1
        case ')' => -1
        case _ => 0
      }
    }
    balance(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChange(acc: Int, money: Int, coins: List[Int]): Int = {
      if (money == 0) acc + 1
      else if (coins.isEmpty || money < 0) acc
      else countChange(acc, money - coins.head, coins) + countChange(acc, money, coins.tail)
    }
    countChange(0, money, coins)
  }
}
