package recfun
import common._

object Main {

  /**
   * Exercise 1
   */

  def balance(chars: String): Boolean = {
    
    def balance_aux(l: List[Char], c: Int): Boolean ={
      if (c < 0)  false

      else if (l.isEmpty) {
        if (c==0) true else false
      }
      
      else if (l.head == '(') balance_aux(l.tail, c+1)
      else if (l.head == ')') balance_aux(l.tail ,c-1)
      else balance_aux(l.tail,c)

    }
    balance_aux(chars.toList, 0)
  }

  

  /**
   * Exercise 2
   */
  // def countChange(money: Int, coins: List[Int]): Int = {
  //   if (money == 0) {
  //   1
  // } else if (money < 0 || coins.isEmpty) {
  //   0 
  // } else {

  //   countChange(money - coins.head, coins) + countChange(money, coins.tail)
  // }

  // }

   def countChange(money: Int, coins: List[Int]): Int = {

     def countChangeAux(moneyLeft: Int, coinsLeft: List[Int]): Int= {

      if (moneyLeft == 0) 1
      else if (moneyLeft <0 || coinsLeft.isEmpty) 0
      else countChange(moneyLeft - coinsLeft.head,coinsLeft) + countChange(moneyLeft,coinsLeft.tail)
      
  }
  countChangeAux(money,coins)
}

}

