## Week 4 - Types and Pattern Matching
## Assignment: Huffman Coding
### [Top](/README.md)
### [Sources](/4-patman/src/main/scala/patmat/Huffman.scala)

Huffman coding is a compression algorithm that can be used to compress list of characters.

***

In a regular text every character is represented by the same number of bits(usually eight).
In Huffman coding, each character can be represented by different number of bits:
most common characters are represented by smaller number of bits, most uncommon
are represented by bigger number of bits. Every Huffman code defines the specific
bit sequence used to represent each character.

***

A Huffman code can be represented by a binary tree whose leaves represent characters that should be encoded.
The code tree below represents the characters A to H:

![](https://d3c33hcgiwev3.cloudfront.net/imageAssetProxy.v1/9JcZmiZJEeaqsg6VQGUNXQ_3714009374b825507d45d2c4d74e5651_huffman-table.png?expiry=1465344000000&hmac=41QItNgEwzWuoBPyQ3Af9_OALmRZGVT8wnC52lYaTYs )

