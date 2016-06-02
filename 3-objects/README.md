## Week 3 - Object-Oriented Sets

There is an abstract class ```TweetSet``` with two concrete subclasses, 
```Empty``` which represents an empty set, and ```NonEmpty(elem: Tweet, left: TweetSet, right: TweetSet)``` which represents
non-empty set.

These classes are *immutable*: there is no operation that modifies a set, all modifying operations return new sets.

1. Filtering

There are two methods for filtering:
```
/** This method takes a predicate and returns a subset of all the elements
 *  in the original set for which the predicate is true.
 */
def filter(p: Tweet => Boolean): TweetSet
def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet
```

```filter``` method takes a predicate as an argument which takes a tweet and returns a boolean, e.g. ```tweets.filter(tweet => tweet.retweets > 10)```

```filterAcc``` is a helper method for a ```filter``` method.

2. Taking Unions

```
def union(that: TweetSet): TweetSet
```

Method ```union``` takes another set and computes a new set which is the union of this and that.

3. Sorting Tweets by Their Influence
```
def descendingByRetweet: TweetList
```

Before implementing ```descendingByRetweet``` it is better to implement ```mostRetweeted``` method.
```
def mostRetweeted: Tweet
```
This method returns the most retweeted tweet from the set.

4. Tying everything together

