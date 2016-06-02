## Week 1 - Recursion
### [Top](/README.md)
### [Sources](1-recursions/src/main/scala/recfun/Main.scala)
All solutions are in the Main class(src/main/scala/recfun/Main.scala)

### Exercise 1: Pascal’s Triangle

The following pattern of numbers is called Pascal’s triangle.
```
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
   ...
```
The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of the two numbers above it. Write a function that computes the elements of Pascal’s triangle by means of a recursive process.

```
def pascal(c: Int, r: Int): Int
```

### Exercise 2: Parentheses Balancing

Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String.

Do this exercise by implementing the balance function in Main.scala. Its signature is as follows:

```
def balance(chars: List[Char]): Boolean
```

### Exercise 3: Counting Change

Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomiation 1 and 2: 1+1+1+1, 1+1+2, 2+2.

Do this exercise by implementing the countChange function inMain.scala. This function takes an amount to change, and a list of unique denominations for the coins. Its signature is as follows:

```
def countChange(money: Int, coins: List[Int]): Int
```