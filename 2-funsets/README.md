## Week 2 - Functional Sets
### [Top](/README.md)
### [Sources](/2-funsets/src/main/scala/funsets/FunSets.scala)
* The goal of this week is to gain practice with **high-order functions**.

* The solutions are in the ```src/main/scala/funsets/FunSets.scala```

* Tests are in the ```src/test/scala/funsets/FunSetSuite.scala```

### Representation

``` type Set = Int => Boolean``` is a function that maps integers to booleans(characteristic function of the set).

For example, we can characterize the set of negative integers by the characteristic function ```(x: Int) => x < 0```.

```Set.apply(x: Int)``` returns ```true``` if it contains the specified argument, otherwise ```false```

Example:

```
val set = FunSets.singletonSet(1)
set(1) //returns true
set(2) //return false
// set(Any Number except 1) returns false
```

Using this representation we define a function in the ```FunSets```:
```
def contains(s: Set, elem: Int): Boolean = s(elem)
```

### Basic functions on sets

1. ```singletonSet``` creates a singleton set from one integer values
2. Functions ```union```, ```intersect```, ```diff``` which takes two sets, and return, respectively, their union, intersection and differences. 
3. Function ```filter``` which selects only the elements of a set that are accepted by a given predicate ```p```.

### Queries and Transformations on Sets

The first function if ```forall```. This function determines whether all elements in the set conform the specified predicate(```p```):
```
def forall(s: Set, p: Int => Boolean): Boolean
```

1. ```forall``` is implemented using linear recursion.
2. ```exists``` is implemented using ```forall``` function (tests whether a set contains at least one element for which the given predicate is true).
3. ```map``` function is implemented using ```exists``` function (transforms a given set into another one by applying to each of its elements the given function).

