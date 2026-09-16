# DSA-JAVA

Data Structures and Algorithms practice repository in Java.

## Topics & Problems

### Arrays
- [Check if Array is Sorted](src/arrays/CheckSortedArray.java)
- [Left Rotate Array by K Places](src/arrays/LeftRotation.java)
- [Majority Element (Moore's Voting Algorithm)](src/arrays/MajorityElement.java)
- [Find Missing Number](src/arrays/MissingNumber.java)
- [Move Zeroes to End](src/arrays/MoveZeroes.java)
- [Remove Duplicates from Sorted Array](src/arrays/RemoveDuplicates.java)
- [Two Sum (Two Pointers)](src/arrays/TwoSum.java)
- [Union of Two Sorted Arrays](src/arrays/UnionArrays.java)

### Sorting
- [Bubble Sort](src/sorting/BubbleSort.java)
- [Insertion Sort](src/sorting/InsertionSort.java)
- [Selection Sort](src/sorting/SelectionSort.java)
- [Recursive Bubble Sort](src/sorting/RecursiveBubbleSort.java)
- [Recursive Insertion Sort](src/sorting/RecursiveInsertionSort.java)

### Hashing
- [Count Frequency of Elements](src/hashing/CountingFrequencies.java)
- [Highest Frequency Element](src/hashing/HighestFrequencyElement.java)
- [Second Highest Frequency Element](src/hashing/SecondHighestFrequency.java)

### Math & Number Theory
- [GCD of Two Numbers (Euclidean Algorithm)](src/math/GCD.java)
- [All Divisors of a Number](src/math/DivisorsOfNumber.java)

### Bit Manipulation
- [Single Number II](src/bitmanipulation/SingleNumberII.java)

### Patterns
- [Pattern 22](src/patterns/Pattern22.java)

### Backtracking
- [N-Queens Problem](src/backtracking/NQueens.java)

### Graphs & Search
- [Water Jug Problem (BFS)](src/graphs/WaterJugBFS.java)

---

## Running the Code

Compile all solutions:
\\ash
javac -d out (Get-ChildItem -Recurse -Filter '*.java' src).FullName
\
Run any specific solution, for example:
\\ash
java -cp out arrays.TwoSum
java -cp out graphs.WaterJugBFS
java -cp out backtracking.NQueens
\