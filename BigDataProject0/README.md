# Exercise 1: Parentheses Balancing




### `balance(chars: String): Boolean`

The `balance` function takes a string of parentheses `chars` and checks whether the parentheses in the string are balanced or not. For example, if the input string is `"((()))"`, the function should return `true`, but if the input string is `"())("` the function should return `false`.

The function uses a helper function `balance_aux` that takes two parameters: a list of characters `l` and an integer `c`. The `c` parameter keeps track of the number of open parentheses encountered so far. The function iterates over the characters in the list `l`, and for each character, it either increments or decrements the `c` parameter depending on whether the character is an open or a close parenthesis.

If the number of open parentheses encountered so far is negative, the function immediately returns `false` because the parentheses are not balanced. If the list is empty and the `c` parameter is zero, the function returns `true` because all the parentheses are balanced. Otherwise, the function continues iterating over the list until it reaches the end.

Finally, the `balance` function calls the `balance_aux` function with the input string converted to a list of characters and the `c` parameter initialized to zero.


# Exercise 2: Coin Change 


### `countChange(money: Int, coins: List[Int]): Int`

The `countChange` function takes an amount of money `money` and a list of coin denominations `coins`, and returns the number of ways in which the amount of money can be made up using the coins in the list. For example, if `money` is 4 and `coins` is `List(1, 2)`, the function should return 3 because there are three ways to make up 4 using the coins 1 and 2: (1, 1, 1, 1), (1, 1, 2), and (2, 2).

The function uses a helper function `countChangeAux` that takes two parameters: an integer `moneyLeft` and a list of integers `coinsLeft`. The `moneyLeft` parameter keeps track of the amount of money that still needs to be made up, and the `coinsLeft` parameter keeps track of the remaining coin denominations.

The function first checks whether `moneyLeft` is zero. If it is, that means the amount of money has been made up, so it returns 1. If `moneyLeft` is negative or if `coinsLeft` is empty, the function returns 0 because either there are no coins left to use or the amount of money cannot be made up using the remaining coins.

Otherwise, the function recursively calls itself twice: once with `moneyLeft` reduced by the value of the first coin denomination in `coinsLeft`, and again with `coinsLeft` reduced by the first coin denomination. The function adds the results of these two recursive calls and returns the sum.

Finally, the `countChange` function calls the `countChangeAux` function with the input `money` and `coins` parameters.
